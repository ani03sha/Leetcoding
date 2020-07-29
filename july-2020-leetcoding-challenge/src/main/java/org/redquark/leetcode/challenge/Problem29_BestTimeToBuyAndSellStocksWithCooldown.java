package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
 * <p>
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before
 * you buy again).
 * <p>
 * After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
 */
public class Problem29_BestTimeToBuyAndSellStocksWithCooldown {

    /**
     * @param prices - prices array
     * @return maximum profit
     */
    public int maxProfit(int[] prices) {
        // Base condition
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int b1 = -prices[0];
        // Sells
        int s1 = 0;
        int s2 = 0;
        // Loop for all the prices
        for (int i = 1; i <= prices.length; i++) {
            int b0 = Math.max(b1, s2 - prices[i - 1]);
            int s0 = Math.max(s1, b1 + prices[i - 1]);
            b1 = b0;
            s2 = s1;
            s1 = s0;
        }
        return s1;
    }
}
