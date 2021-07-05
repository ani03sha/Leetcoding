package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with
 * a different size r x c keeping its original data.
 * <p>
 * You are given an m x n matrix mat and two integers r and c representing the row number and column number
 * of the wanted reshaped matrix.
 * <p>
 * The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing
 * order as they were.
 * <p>
 * If the reshape operation with given parameters is possible and legal, output the new reshaped matrix;
 * Otherwise, output the original matrix.
 * <p>
 * Constraints:
 * <p>
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 100
 * -1000 <= mat[i][j] <= 1000
 * 1 <= r, c <= 300
 */
public class Problem05_ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] matrix, int r, int c) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // Dimensions of the matrix
        int m = matrix.length;
        int n = matrix[0].length;
        // Check for legality
        if (m * n != r * c) {
            return matrix;
        }
        int[][] reshapedMatrix = new int[r][c];
        // Indices for row and column
        int row = 0;
        int column = 0;
        // Populate this matrix
        for (int[] currentRow : matrix) {
            for (int j = 0; j < n; j++) {
                reshapedMatrix[row][column] = currentRow[j];
                column++;
                // If we have reached to the end of the row
                if (column == c) {
                    // Update the column and row indices
                    column = 0;
                    row++;
                }
            }
        }
        return reshapedMatrix;
    }
}
