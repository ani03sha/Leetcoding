package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the
 * bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * How many possible unique paths are there?
 * <p>
 * Constraints:
 * <p>
 * 1 <= m, n <= 100
 * It's guaranteed that the answer will be less than or equal to 2 * 10 ^ 9.
 */
public class Problem29_UniquePaths {

    /**
     * @param m - number of rows
     * @param n - number of columns
     * @return number of unique paths from (0, 0) to (m - 1, n - 1)
     */
    public int uniquePaths(int m, int n) {
        // DP array
        int[][] dp = new int[m][n];
        // Number of paths to reach any cell in column 1
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        // Number of paths to reach any cell in row 1
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        // Count paths for other cells in bottom-up manner
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
