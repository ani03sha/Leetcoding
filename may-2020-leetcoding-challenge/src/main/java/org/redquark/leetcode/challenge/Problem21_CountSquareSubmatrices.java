package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an m * n matrix of ones and zeros, return how many square submatrices have all ones.
 */
public class Problem21_CountSquareSubmatrices {

    /**
     * @param matrix - input matrix
     * @return - count of square matrices of 1s
     */
    public int countSquares(int[][] matrix) {
        // Counter for square matrix of 1s
        int count = 0;
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        // Rows and columns of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // DP array
        int[][] dp = new int[rows][columns];
        // Loop for each permutation
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    continue;
                }
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j];
                    count += dp[i][j];
                    continue;
                }
                dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                count += dp[i][j];
            }
        }
        return count;
    }
}
