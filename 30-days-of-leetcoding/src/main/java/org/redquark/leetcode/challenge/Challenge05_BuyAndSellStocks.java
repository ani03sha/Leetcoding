package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (i.e., buy one and sell one share of the stock multiple times).
 * <p>
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */
public class Challenge05_BuyAndSellStocks {

    /**
     * @param prices - array of stock prices on consecutive days
     * @return maximum profit earned by buying and selling stocks
     * <p>
     * Algorithm:
     * 1. Find local minima and set it as starting index.
     * 2. If it doesn't exist then return
     * 3. Find the local maxima and set it as the ending index
     * 4. If we reach the end, set the end as the ending index
     * 5. Add the pair if buying and selling index in the list
     * 6. Find the maximum profit by adding individual profits
     */
    public int findMaximumProfit(int[] prices) {
        // Length of the array
        int n = prices.length;
        // Base condition - Prices must be given for at least two days
        if (n == 1) {
            return 0;
        }
        // Counter that denotes the number of times a buy-sell activity happens
        int count = 0;
        // List that will store the pairs of buy-sell indexes
        List<Interval> pairs = new ArrayList<>();
        // Traverse through the given price array
        int i = 0;
        while (i < n - 1) {
            // Find the local minima. Since we are comparing current element to the next
            // element, therefore the limit will be n-2
            while (i < n - 1 && (prices[i + 1] <= prices[i])) {
                i++;
            }
            // If we reach to the end then there will be no further solution, so break loop
            if (i == n - 1) {
                break;
            }
            // Object of interval class
            Interval interval = new Interval();
            // Index of local minima
            interval.buy = i++;
            // Find local maxima, where limit is n-1
            while (i < n && prices[i] >= prices[i - 1]) {
                i++;
            }
            // Index of local maxima
            interval.sell = i - 1;
            // Add this interval to the list of pairs
            pairs.add(interval);
            // Increment the number of buy-sell
            count++;
        }
        // Check if count is zero then no profit occurred
        if (count == 0) {
            return 0;
        } else {
            // Get the sum of profits of the individual pairs
            int totalProfit = 0;
            for (Interval interval : pairs) {
                totalProfit += prices[interval.sell] - prices[interval.buy];
            }
            return totalProfit;
        }
    }

    /**
     * This class represents the pair of days to buy and sell stocks
     */
    private static class Interval {
        // Index (or day) at which one should buy
        int buy;
        // Index (or day) at which one should sell
        int sell;
    }
}
