package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an n x n matrix where each of the rows and columns are sorted in ascending order, return
 * the kth smallest element in the matrix.
 * <p>
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == matrix.length
 * n == matrix[i].length
 * 1 <= n <= 300
 * -10^9 <= matrix[i][j] <= 10^9
 * All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
 * 1 <= k <= n^2
 */
public class Problem07_KthSmallestElementInASortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        // Order of the matrix
        int N = matrix.length;
        // Smallest element in the matrix
        int lowest = matrix[0][0];
        // Greatest element in the matrix
        int greatest = matrix[N - 1][N - 1];
        // Binary search in this range
        while (lowest < greatest) {
            // Middle value
            int middle = lowest + (greatest - lowest) / 2;
            // Position of the middle value in the sorted matrix
            int position = getPosition(matrix, middle);
            // if the position is less than the target
            if (position < k) {
                // Move to the right half
                lowest = middle + 1;
            } else {
                greatest = middle;
            }
        }
        return greatest;
    }

    private int getPosition(int[][] matrix, int target) {
        // Rows and columns of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Indices to traverse the matrix
        int i = rows - 1;
        int j = 0;
        // Position of the element
        int position = 0;
        // Loop until we are inside the boundary of the matrix
        while (i >= 0 && j < columns) {
            if (target >= matrix[i][j]) {
                position += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return position;
    }
}
