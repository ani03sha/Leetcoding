package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array prices where prices[i] is the price of a given stock on the
 * ith day.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete at most k transactions.
 * <p>
 * Notice that you may not engage in multiple transactions simultaneously
 * (i.e., you must sell the stock before you buy again).
 * <p>
 * Constraints:
 * <p>
 * 0 <= k <= 10^9
 * 0 <= prices.length <= 10^4
 * 0 <= prices[i] <= 1000
 */
public class Problem18_BestTimeToBuyAndSellStocksIV {

    /**
     * @param k      - maximum number of transactions
     * @param prices - array of stock prices
     * @return maximum profit
     */
    public int maxProfit(int k, int[] prices) {
        if (prices.length < 2 || k < 1) {
            return 0;
        }
        if (k > prices.length / 2) {
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                profit += Math.max(0, prices[i] - prices[i - 1]);
            }
            return profit;
        }
        // Buy array
        int[] buy = new int[k];
        Arrays.fill(buy, Integer.MIN_VALUE);
        int[] sell = new int[k];
        for (int price : prices) {
            for (int j = 0; j < k; j++) {
                buy[j] = Math.max(buy[j], (j > 0 ? sell[j - 1] : 0) - price);
                sell[j] = Math.max(sell[j], buy[j] + price);
            }
        }
        return sell[k - 1];
    }
}
