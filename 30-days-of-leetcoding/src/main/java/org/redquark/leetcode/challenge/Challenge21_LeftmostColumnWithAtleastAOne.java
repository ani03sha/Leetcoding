package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * A binary matrix means that all elements are 0 or 1. For each individual row of the matrix, this row is
 * sorted in non-decreasing order.
 * <p>
 * Given a row-sorted binary matrix binaryMatrix, return leftmost column index(0-indexed) with at least a 1 in it.
 * If such index doesn't exist, return -1.
 * <p>
 * You can't access the Binary Matrix directly.  You may only access the matrix using a BinaryMatrix interface:
 * <p>
 * BinaryMatrix.get(x, y) returns the element of the matrix at index (x, y) (0-indexed).
 * BinaryMatrix.dimensions() returns a list of 2 elements [n, m], which means the matrix is n * m.
 * Submissions making more than 1000 calls to BinaryMatrix.get will be judged Wrong Answer.
 * Also, any solutions that attempt to circumvent the judge will result in disqualification.
 */
public class Challenge21_LeftmostColumnWithAtleastAOne {

    /**
     * @param binaryMatrix - instance of a BinaryMatrix
     * @return - leftmost column index having atleast a one
     * <p>
     * Algorithm:
     * 1. Start from the first row and last column
     * 2. If the current element is 1, then we check left
     * 3. Keep track of the minimum index
     * 4. If the current element is 0, then we check down
     */
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        // Get the dimensions of the matrix
        List<Integer> dims = binaryMatrix.dimensions();
        // Get the row and columns from the above List
        int row = dims.get(0);
        int column = dims.get(1);
        // First row
        int i = 0;
        // Last column
        int j = column - 1;
        // This will track the left most index having atleast a one
        int index = -1;
        // Loop for each row
        while (i < row && j >= 0) {
            // If we encounter 0, then it means we need to check rows beneath it
            if (binaryMatrix.get(i, j) == 0) {
                // Increment - to move to the down
                i++;
            } else {
                // If we encounter 1, then it means we need to move left so check if any
                // column left to it has one
                index = j;
                // Decrement - to move to the left
                --j;
            }
        }
        return index;
    }

    interface BinaryMatrix {
        int get(int x, int y);

        List<Integer> dimensions();
    }

    static class BinaryMatrixImpl implements BinaryMatrix {

        private final int[][] matrix;

        BinaryMatrixImpl(int[][] matrix) {
            this.matrix = matrix;
        }

        @Override
        public int get(int x, int y) {
            return matrix[x][y];
        }

        @Override
        public List<Integer> dimensions() {
            return Arrays.asList(matrix.length, matrix[0].length);
        }
    }
}
