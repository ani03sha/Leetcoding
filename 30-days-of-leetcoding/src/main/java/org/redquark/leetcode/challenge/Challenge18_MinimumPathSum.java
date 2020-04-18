package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which
 * minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 */
public class Challenge18_MinimumPathSum {

    /**
     * @param grid - input grid
     * @return - minimum sum of paths
     * <p>
     * Algorithm:
     * 1. This is a dp problem so we will create a dp array
     * 2. Loop through the entire grid and then take the minimum of the top or left and add it
     */
    public int minPathSum(int[][] grid) {
        // Base condition
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Create a dp array
        int[][] dp = new int[grid.length][grid[0].length];
        // Loop through the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // Assign the current element to the dp array
                dp[i][j] = grid[i][j];
                // Condition - when we are somewhere in the middle of the grid
                if (i > 0 && j > 0) {
                    dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
                } else if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                } else if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
