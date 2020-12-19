package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a rows x cols matrix grid representing a field of cherries.
 * Each cell in grid represents the number of cherries that you can collect.
 * <p>
 * You have two robots that can collect cherries for you, Robot #1 is located at the
 * top-left corner (0,0), and Robot #2 is located at the top-right corner (0, cols-1) of the grid.
 * <p>
 * Return the maximum number of cherries collection using both robots by following the rules below:
 * <p>
 * From a cell (i,j), robots can move to cell (i+1, j-1) , (i+1, j) or (i+1, j+1).
 * When any robot is passing through a cell, It picks it up all cherries, and the cell becomes an empty cell (0).
 * When both robots stay on the same cell, only one of them takes the cherries.
 * Both robots cannot move outside of the grid at any moment.
 * Both robots should reach the bottom row in the grid.
 * <p>
 * Constraints:
 * <p>
 * rows == grid.length
 * cols == grid[i].length
 * 2 <= rows, cols <= 70
 * 0 <= grid[i][j] <= 100
 */
public class Problem19_CherryPickupII {

    /**
     * @param grid - grid of cherries
     * @return maximum number of cherries collected
     */
    public int cherryPickup(int[][] grid) {
        // Row and column of the matrix
        int row = grid.length;
        int column = grid[0].length;
        // DP array
        Integer[][][] dp = new Integer[row][column][column];
        return dfs(grid, row, column, 0, 0, column - 1, dp);
    }

    private int dfs(int[][] grid, int m, int n, int r, int c1, int c2, Integer[][][] dp) {
        // Reach to the bottom row
        if (r == m) {
            return 0;
        }
        if (dp[r][c1][c2] != null) {
            return dp[r][c1][c2];
        }
        int answer = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nc1 = c1 + i;
                int nc2 = c2 + j;
                if (nc1 >= 0 && nc1 < n && nc2 >= 0 && nc2 < n) {
                    answer = Math.max(answer, dfs(grid, m, n, r + 1, nc1, nc2, dp));
                }
            }
        }
        int cherries = c1 == c2 ? grid[r][c1] : grid[r][c1] + grid[r][c2];
        return dp[r][c1][c2] = answer + cherries;
    }
}
