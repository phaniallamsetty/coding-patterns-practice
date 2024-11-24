package com.pallamsetty.slidingwindow;

/*
* Leetcode 121
* */

public class Stocks {
    public int getBestTimeToBuyAndSellStocks(int[] prices) {
        int buy = 0;
        int sell = 1;
        int max = 0;

        while(sell < prices.length) {
            int current = prices[sell] - prices[buy];
            if(current <= 0) {
                buy = sell;
            } else {
                max = Math.max(current, max);
            }
            sell++;
        }

        return max;
    }
}
