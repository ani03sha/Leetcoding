package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array of binary strings strs and two integers m and n.
 * <p>
 * Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.
 * <p>
 * A set x is a subset of a set y if all elements of x are also elements of y.
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 600
 * 1 <= strs[i].length <= 100
 * strs[i] consists only of digits '0' and '1'.
 * 1 <= m, n <= 100
 */
public class Problem02_OnesAndZeroes {

    public int findMaxForm(String[] strs, int m, int n) {
        // Special case
        if (strs == null || strs.length == 0) {
            return 0;
        }
        // DP array
        int[][] dp = new int[m + 1][n + 1];
        // Loop through the array of strings
        for (String str : strs) {
            // Count of ones and zeroes
            int ones = 0;
            int zeroes = 0;
            // Loop through every character of the
            // i-th string
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    ones++;
                } else {
                    zeroes++;
                }
            }
            // Loop for m and n times
            for (int j = m; j >= zeroes; j--) {
                for (int k = n; k >= ones; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zeroes][k - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
