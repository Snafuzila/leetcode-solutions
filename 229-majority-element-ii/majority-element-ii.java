class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0, c2=0, count1=0, count2=0;
        List<Integer> result = new ArrayList<>();
        for (int num : nums)
        {
            if (num ==c1) count1++;
            else if (num==c2) count2++;
            else if (count1 == 0) 
            {
                c1 = num;
                count1 = 1;
            }
            else if (count2 == 0) 
            {
                c2 = num;
                count2 = 1;
            }
            else
            {
                count1--; count2--;
            }
        }
        count1 = count2 = 0;
        for (int num: nums)
        {
            if (c1 ==num) count1++;
            if (c2 == num) count2++; 
        }
        if (count1> nums.length/3) result.add(c1);
        if (c1!=c2 && count2>nums.length/3) result.add(c2);
        return result;

    }
}