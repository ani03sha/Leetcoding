package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day,
 * and an integer fee representing a transaction fee.
 * <p>
 * Find the maximum profit you can achieve.
 * You may complete as many transactions as you like,
 * but you need to pay the transaction fee for each transaction.
 * <p>
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell
 * the stock before you buy again).
 * <p>
 * Constraints:
 * <p>
 * 1 < prices.length <= 5 * 10^4
 * 0 < prices[i], fee < 5 * 10^4
 */
public class Problem16_BestTimeToBuyAndSellStockWithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        // Length of the array
        int n = prices.length;
        // Special case
        if (n < 2) {
            return 0;
        }
        // Price on which we buy the stock
        int buy = -prices[0] - fee;
        // Price on which we sell the stock
        int sell = 0;
        // Loop through the array
        for (int i = 1; i < n; i++) {
            // Last buying price
            int lastBuy = buy;
            buy = Math.max(buy, sell - prices[i] - fee);
            sell = Math.max(sell, lastBuy + prices[i]);
        }
        return sell;
    }
}
