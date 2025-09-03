class Solution {
    public int maxProfit(int[] prices)
    {
        int min_price = 10000;
        int profit = 0;
        for (int i = 0; i<prices.length;i++)
            {
                if (min_price>prices[i])
                {
                    min_price = prices[i];
                }
                else if (prices[i]-min_price > profit)
                {
                    profit = prices[i] - min_price;
                }
            }
        return profit;
    }
}
