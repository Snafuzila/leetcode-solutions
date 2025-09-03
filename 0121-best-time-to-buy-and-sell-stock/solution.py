class Solution(object):
    def maxProfit(self, prices):
        min_price = 10000
        profit = 0
        for price in prices:
            if price < min_price:
                min_price = price
            elif price - min_price > profit:
                profit = price - min_price

        return profit

        
