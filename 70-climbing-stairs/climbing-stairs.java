class Solution {
    public int climbStairs(int n) {
        if (n<=2) return n;
        int prev1 = 1;
        int prev2 = 0;
        int current = 0;
        for (int i=0; i<n;i++)
        {
            current = prev1+prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}