class Solution(object):
    def rotate(self, nums, k):
        """
        n = len(nums)
        k %= n
        for _ in range(k):
            last = nums[-1]
            for i in range(n):
                nums[i], last = last, nums[i]
        """
        n = len(nums)
        k %= n
        nums.reverse()
        nums[:k] = reversed(nums[:k])
        nums[k:] = reversed(nums[k:])

