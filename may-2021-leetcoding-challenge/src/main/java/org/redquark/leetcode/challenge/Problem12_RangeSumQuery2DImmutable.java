package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a 2D matrix matrix, handle multiple queries of the following type:
 * <p>
 * Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1)
 * and lower right corner (row2, col2).
 * <p>
 * Implement the NumMatrix class:
 * <p>
 * NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
 * int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside
 * the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 200
 * -10^5 <= matrix[i][j] <= 10^5
 * 0 <= row1 <= row2 < m
 * 0 <= col1 <= col2 < n
 * At most 10^4 calls will be made to sumRegion.
 */
public class Problem12_RangeSumQuery2DImmutable {

    static class NumMatrix {
        // Table to store the sum of each submatrix
        private final int[][] lookup;

        public NumMatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            lookup = new int[m + 1][n + 1];
            // Fill up this lookup table
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    lookup[i][j] = lookup[i - 1][j] + lookup[i][j - 1] + matrix[i - 1][j - 1] - lookup[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            // Since we will be looking up in the lookup table,
            // we will increment row and columns by 1
            row1++;
            col1++;
            row2++;
            col2++;
            return lookup[row2][col2] - lookup[row1 - 1][col2] - lookup[row2][col1 - 1] + lookup[row1 - 1][col1 - 1];
        }
    }
}
