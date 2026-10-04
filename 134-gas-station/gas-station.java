class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int current = 0;
        int pos = 0;
        for (int i = 0; i<gas.length; i++)
        {
            int net = gas[i]-cost[i];
            total +=net;
            current += net;
            if (current<0)
            {
                current = 0;
                pos = i+1;
            }
        }
        return total>=0 ? pos : -1;
    }
}