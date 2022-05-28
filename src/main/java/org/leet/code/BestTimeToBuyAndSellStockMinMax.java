package org.leet.code;

public class BestTimeToBuyAndSellStockMinMax {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return -1;
        }
        int max = prices[0];
        int min = max;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                profit = profit + (max - min);
                min = prices[i];
                max = prices[i];
            } else {
                max = prices[i];
            }
        }
        profit = profit + (max - min);
        return profit;
    }
}
