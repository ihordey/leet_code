package org.leet.code;

public class BestTimeToBuyAndSellStockMaxDelta {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return -1;
        }

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = profit + (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}
