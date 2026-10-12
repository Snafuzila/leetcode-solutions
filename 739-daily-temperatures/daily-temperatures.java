class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n]; //default 0
        int[] stack = new int[n];
        int top = -1;
        for (int i=0; i<n; i++){
            while (top>-1 && temperatures[i]> temperatures[stack[top]])
            {
                result[stack[top]] = i-stack[top];
                top--;
            }
            stack[++top]=(i);
        }
        return result;

    }
}