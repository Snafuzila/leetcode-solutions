class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0, count = 0;
        int farthest = nums[0];
        for(int i = 0; i<n-1;i++)
            {
                farthest = Math.max(farthest, nums[i]+i);
                if (i==end)
                {
                    count++;
                    end=farthest;
                }
            }
        return count;
    }
}
