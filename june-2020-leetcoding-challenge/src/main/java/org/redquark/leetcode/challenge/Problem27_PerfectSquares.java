package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 */
public class Problem27_PerfectSquares {

    /**
     * @param n - input number
     * @return least count of perfect squares that make up n
     */
    public int numSquares(int n) {
        // DP array
        int[] dp = new int[n + 1];
        // Loop for all the elements from 1 to n
        for (int i = 1; i <= n; i++) {
            // Minimum square value
            int min = i;
            int j = 1;
            int square = 1;
            while (square <= i) {
                // Update
                min = Math.min(min, 1 + dp[i - square]);
                j++;
                square = j * j;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
