package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an m x n integers matrix, return the length of the longest increasing path in matrix.
 * <p>
 * From each cell, you can either move in four directions: left, right, up, or down.
 * You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 200
 * 0 <= matrix[i][j] <= 2^31 - 1
 */
public class Problem10_LongestIncreasingPathInAMatrix {

    // Directions in x and y directions
    private final int[] abscissae = {0, 0, -1, 1};
    private final int[] ordinates = {1, -1, 0, 0};

    public int longestIncreasingPath(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        // Longest length of increasing path
        int pathLength = 0;
        // Rows and columns of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // DP matrix where dp[i][j] represents longest
        // increasing path from i-th row and j-th column
        int[][] dp = new int[rows][columns];
        // Loop for every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                pathLength = Math.max(pathLength, dfs(matrix, rows, columns, i, j, dp));
            }
        }
        return pathLength;
    }

    private int dfs(int[][] matrix, int rows, int columns, int i, int j, int[][] dp) {
        // Check in the dp array
        if (dp[i][j] > 0) {
            return dp[i][j];
        }
        // Current maximum
        int currentMaximum = 0;
        // Loop in all the directions
        for (int k = 0; k < 4; k++) {
            int x = abscissae[k] + i;
            int y = ordinates[k] + j;
            // Check for the valid cases
            if (x >= 0 && x < rows && y >= 0 && y < columns && matrix[x][y] > matrix[i][j]) {
                currentMaximum = Math.max(currentMaximum, dfs(matrix, rows, columns, x, y, dp));
            }
        }
        return dp[i][j] = currentMaximum + 1;
    }
}
