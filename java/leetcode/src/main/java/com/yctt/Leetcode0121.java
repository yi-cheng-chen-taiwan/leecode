package com.yctt;

/**
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Easy
 */
public class Leetcode0121 {
    // Time Complexity: O(n^2)
    // public int maxProfit(int[] prices) {
    //     int maxProfit = 0;

    //     for (int i = 0; i < prices.length; ++i) {
    //         for (int j = i + 1; j < prices.length; ++j) {
    //             if (prices[j] > prices[i]) {
    //                 maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
    //             }
    //         }
    //     }

    //     return maxProfit;
    // }

    public int maxProfit(int[] prices) {
        int startPos = 0, endPos = 1;
        int maxProfit = 0;

        while (endPos < prices.length) {
            int profit = prices[endPos] - prices[startPos];

            if (profit < 0) {
                startPos = endPos;
                endPos = startPos + 1;
            } else {
                maxProfit = Math.max(maxProfit, profit);
                endPos++;
            }
        }

        return maxProfit;
    }
}
