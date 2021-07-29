package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an m x n binary matrix, return the distance of the nearest 0 for each cell.
 * <p>
 * The distance between two adjacent cells is 1.
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10^4
 * 1 <= m * n <= 10^4
 * mmatrixat[i][j] is either 0 or 1.
 * There is at least one 0 in matrix.
 */
public class Problem29_01Matrix {

    public int[][] updateMatrix(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // Dimensions of the matrix
        int m = matrix.length;
        int n = matrix[0].length;
        // Matrix to store the distances
        int[][] distance = new int[m][n];
        // R
        // Maximum range of values
        int range = m * n;
        // Loop through every cell in the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    distance[i][j] = 0;
                } else {
                    // Minimum distance from up and left cell
                    distance[i][j] = 1 + Math.min(i > 0 ? distance[i - 1][j] : range, j > 0 ? distance[i][j - 1] : range);
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == 0) {
                    distance[i][j] = 0;
                } else {
                    // Minimum distance from down and right cell
                    distance[i][j] = Math.min(distance[i][j],
                            1 + Math.min(i < m - 1 ? distance[i + 1][j] : range, j < n - 1 ? distance[i][j + 1] : range));
                }
            }
        }
        return distance;
    }
}
