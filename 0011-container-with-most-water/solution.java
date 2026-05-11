class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxVolume = 0;

        while (start<end)
        {
            int currentHeight = Math.min(height[start], height[end]);
            maxVolume = Math.max(maxVolume,  (end-start) * currentHeight);

            if (height[start]<height[end])
            {
                start++;
            }
            else end--;
        }
        return maxVolume;
    }
}
