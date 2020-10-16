package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has
 * the following properties:
 * <p>
 * - Integers in each row are sorted from left to right.
 * - The first integer of each row is greater than the last integer of the previous row.
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 0 <= m, n <= 100
 * -10^4 <= matrix[i][j], target <= 10^4
 */
public class Problem16_SearchA2DMatrix {

    /**
     * @param matrix - input 2D matrix
     * @param target - number to be searched
     * @return true if the number is present, false otherwise
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int low = 0;
        int high = rows - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][columns - 1]) {
                return binarySearch(matrix[mid], target);
            } else if (target < matrix[mid][0]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    private boolean binarySearch(int[] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid] == target) {
                return true;
            } else if (matrix[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
