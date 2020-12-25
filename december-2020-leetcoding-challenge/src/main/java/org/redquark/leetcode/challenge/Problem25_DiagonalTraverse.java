package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a matrix of M x N elements (M rows, N columns), return all elements of
 * the matrix in diagonal order as shown in the below image.
 * <p>
 * Note:
 * <p>
 * The total number of elements of the given matrix will not exceed 10,000.
 */
public class Problem25_DiagonalTraverse {

    /**
     * @param matrix - input matrix
     * @return - diagonal order of the matrix
     */
    public int[] findDiagonalOrder(int[][] matrix) {
        // Base condition
        if (matrix.length == 0) {
            return new int[0];
        }
        // Rows and columns of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Resultant array
        int[] diagonal = new int[rows * columns];
        // Indices to traverse through row and columns
        int i = 0;
        int j = 0;
        // Index for result
        int index = 0;
        // Loop through the matrix elements
        while (i < rows && j < columns) {
            // Moving up
            while (i >= 0 && j < columns) {
                diagonal[index] = matrix[i][j];
                index++;
                i--;
                j++;
            }
            i++;
            // If reached the end of the column
            if (j == columns) {
                i++;
                j--;
            }
            // Moving down
            while (j >= 0 && i < rows) {
                diagonal[index] = matrix[i][j];
                index++;
                i++;
                j--;
            }
            j++;
            // If reached the end of the row
            if (i == rows) {
                i--;
                j++;
            }
        }
        return diagonal;
    }
}
