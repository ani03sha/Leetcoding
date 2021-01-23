package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost
 * row or leftmost column and going in the bottom-right direction until reaching the matrix's end.
 * <p>
 * For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix,
 * includes cells mat[2][0], mat[3][1], and mat[4][2].
 * <p>
 * Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and
 * return the resulting matrix.
 * <p>
 * Constraints:
 * <p>
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 100
 * 1 <= mat[i][j] <= 100
 */
public class Problem23_SortTheMatrixDiagonally {

    /**
     * @param matrix - input matrix
     * @return diagonally sorted matrix
     */
    public int[][] diagonalSort(int[][] matrix) {
        // Rows and columns of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Map to store the elements in each diagonal
        Map<Integer, List<Integer>> diagonalMapping = new HashMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int currentKey = i - j;
                List<Integer> currentDiagonalElements = diagonalMapping.get(currentKey);
                if (currentDiagonalElements == null) {
                    currentDiagonalElements = new ArrayList<>();
                }
                currentDiagonalElements.add(matrix[i][j]);
                diagonalMapping.put(currentKey, currentDiagonalElements);
            }
        }
        // Sort all the lists
        for (int key : diagonalMapping.keySet()) {
            List<Integer> currentList = diagonalMapping.get(key);
            Collections.sort(currentList);
            diagonalMapping.put(key, currentList);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int currentDiagonalDifference = i - j;
                List<Integer> diagonalElements = diagonalMapping.get(currentDiagonalDifference);
                matrix[i][j] = diagonalElements.get(0);
                diagonalElements.remove(0);
            }
        }
        return matrix;
    }
}
