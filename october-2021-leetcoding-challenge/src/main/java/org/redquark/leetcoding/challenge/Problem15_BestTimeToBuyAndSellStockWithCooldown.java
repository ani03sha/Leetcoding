package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
 * <p>
 * After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 5000
 * 0 <= prices[i] <= 1000
 */
public class Problem15_BestTimeToBuyAndSellStockWithCooldown {

    public int maxProfit(int[] prices) {
        // Special cases
        if (prices == null || prices.length < 2) {
            return 0;
        }
        // Length of the array
        int n = prices.length;
        // Arrays to store buying and selling prices
        int[] buyingPrices = new int[n];
        int[] sellingPrices = new int[n];
        // Fill the buying price array with default values
        Arrays.fill(buyingPrices, Integer.MIN_VALUE);
        // Buying price for the first day
        buyingPrices[0] = Math.max(buyingPrices[0], -prices[0]);
        // Calculate the profits for each day
        for (int i = 1; i < n; i++) {
            // We have two cases for buying stocks, we can either
            // not buy a stock or we can skip the previous day to
            // honor the one day cooldown period
            buyingPrices[i] = Math.max(buyingPrices[i - 1], (i > 1 ? sellingPrices[i - 2] : 0) - prices[i]);
            // There is no restriction on selling stocks, so it will
            // be as is
            sellingPrices[i] = Math.max(sellingPrices[i - 1], buyingPrices[i - 1] + prices[i]);
        }
        return sellingPrices[n - 1];
    }
}
