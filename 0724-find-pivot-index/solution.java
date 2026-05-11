class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n<=1) return 0;

        int pivot = 0;
        int rightSum = 0;
        int leftSum=0;
        for (int i = 0;i<n; i++)
        {
            rightSum+= nums[i];
        }

        rightSum-= nums[0];
        if (rightSum==leftSum)
        {
            return 0;
        }
        
        for (int i = 1;i<n; i++)
        {
            rightSum-= nums[i];
            leftSum+=nums[i-1];
            if (rightSum==leftSum)
            {
                return i;
            }
        }
        return -1;

    }
}
