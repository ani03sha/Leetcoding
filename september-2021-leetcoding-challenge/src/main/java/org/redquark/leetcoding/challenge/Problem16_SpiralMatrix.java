package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 */
public class Problem16_SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        // List to store the output
        List<Integer> output = new ArrayList<>();
        // Special case
        if (matrix == null || matrix.length == 0) {
            return output;
        }
        // Dimensions of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Indices for traversing in four directions
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;
        // Variable to keep track of the next direction
        int direction = 1;
        // Loop inside the matrix boundaries
        while (top <= bottom && left <= right) {
            // Moving left to right
            if (direction == 1) {
                for (int i = left; i <= right; i++) {
                    output.add(matrix[top][i]);
                }
                top++;
                direction = 2;
            }
            // Moving top to bottom
            else if (direction == 2) {
                for (int i = top; i <= bottom; i++) {
                    output.add(matrix[i][right]);
                }
                --right;
                direction = 3;
            }
            // Moving right to left
            else if (direction == 3) {
                for (int i = right; i >= left; i--) {
                    output.add(matrix[bottom][i]);
                }
                bottom--;
                direction = 4;
            }
            // Moving bottom to top
            else {
                for (int i = bottom; i >= top; i--) {
                    output.add(matrix[i][left]);
                }
                left++;
                direction = 1;
            }
        }
        return output;
    }
}
