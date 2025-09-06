class Solution(object):
    def jump(self, nums):
        n = len(nums)
        if n <= 1:
            return 0  # no jumps needed

        jumps = 0
        end = 0
        farthest = 0

        for i in range(n - 1):
            farthest = max(farthest, i + nums[i])

            # if we've reached the end of the current jump range
            if i == end:
                jumps += 1
                end = farthest

                # early stop: already can reach last index
                if end >= n - 1:
                    break

        return jumps

