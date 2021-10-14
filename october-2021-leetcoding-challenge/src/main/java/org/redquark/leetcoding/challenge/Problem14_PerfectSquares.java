package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer n, return the least number of perfect square numbers that sum to n.
 * <p>
 * A perfect square is an integer that is the square of an integer; in other words, it is the product of some
 * integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 10^4
 */
public class Problem14_PerfectSquares {

    public int numSquares(int n) {
        // Find the square root of n to determine the
        // integers which can be used to make n.
        int squareRoot = (int) Math.sqrt(n);
        // DP array to store minimum perfect squares to
        // to make a number
        int[] dp = new int[n + 1];
        // Fill DP array with the default value
        Arrays.fill(dp, Integer.MAX_VALUE);
        // Nothing is needed to make 0
        dp[0] = 0;
        // Populate the DP table from 1 to n
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= squareRoot; j++) {
                // Check if it is possible to use the current
                // perfect square
                if (j * j <= i) {
                    dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                }
            }
        }
        return dp[n];
    }
}
