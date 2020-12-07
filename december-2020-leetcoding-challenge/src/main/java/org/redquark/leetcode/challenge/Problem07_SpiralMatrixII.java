package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in
 * spiral order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 20
 */
public class Problem07_SpiralMatrixII {

    /**
     * @param n - size of the sqaure matrix
     * @return - spiral matrix
     */
    public int[][] generateMatrix(int n) {
        // This will store the result
        int[][] result = new int[n][n];
        // Value to be put in the cell
        int value = 1;
        // Top and bottom of the square matrix
        int top = 0;
        int bottom = n - 1;
        // Left and right of the square matrix
        int left = 0;
        int right = n - 1;
        // Loop until the value reaches the square of n
        while (value <= n * n) {
            for (int i = left; i <= right; i++) {
                result[top][i] = value;
                value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = value;
                value++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = value;
                value++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = value;
                value++;
            }
            left++;
        }
        return result;
    }
}
