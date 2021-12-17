package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 */
public class Problem17_MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        // Rows and columns of the matrix
        int m = matrix.length;
        int n = matrix[0].length;
        // Lookup table to store the size of the sub-matrix
        // of which current cell is the bottom right corner
        int[][] lookup = new int[m + 1][n + 1];
        // Variable to keep track of biggest square matrix seen so far
        int maxSize = 0;
        // Loop through the matrix and populate the lookup table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the current cell has 1, then we can consider
                // it as a valid case and try to make it as the part
                // of the valid sub matrix
                if (matrix[i - 1][j - 1] == '1') {
                    lookup[i][j] = Math.min(lookup[i - 1][j], Math.min(lookup[i - 1][j - 1], lookup[i][j - 1])) + 1;
                    maxSize = Math.max(maxSize, lookup[i][j]);
                }
            }
        }
        return maxSize * maxSize;
    }
}
