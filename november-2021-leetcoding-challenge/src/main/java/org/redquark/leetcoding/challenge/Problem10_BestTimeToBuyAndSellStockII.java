package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the
 * stock at any time. However, you can buy it then immediately sell it on the same day.
 * <p>
 * Find and return the maximum profit you can achieve.
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 3 * 10^4
 * 0 <= prices[i] <= 10^4
 */
public class Problem10_BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        // Special cases
        if (prices == null || prices.length < 2) {
            return 0;
        }
        // Since we cannot buy second share before selling
        // the first one, we can just go sequentially and
        // buy stock and sell it if the next element is greater
        // than the last element
        int totalProfit = 0;
        // Loop through the array
        for (int i = 1; i < prices.length; i++) {
            totalProfit += Math.max(prices[i] - prices[i - 1], 0);
        }
        return totalProfit;
    }
}
