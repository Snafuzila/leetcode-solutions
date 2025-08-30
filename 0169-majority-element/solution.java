class Solution {
    public int majorityElement(int[] nums) {
        int type = 0,count = 0;
        for(int num : nums)
        {
            if (count == 0 || type == num) 
            {
                type = num;
                count++;
            }
            else count--;
        }
        return type;
    }
}
