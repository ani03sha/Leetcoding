package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share
 * of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Note that you cannot sell a stock before you buy one.
 */
public class Problem18_BestTimeToBuyAndSellStocks {

    /**
     * @param prices - input array of prices
     * @return - maximum profit
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int n : prices) {
            if (n < min) {
                min = n;
            } else {
                max = Math.max(max, n - max);
            }
        }
        return max;
    }
}
