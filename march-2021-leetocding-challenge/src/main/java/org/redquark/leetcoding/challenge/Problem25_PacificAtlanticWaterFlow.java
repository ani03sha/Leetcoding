package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent,
 * the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right
 * and bottom edges.
 * <p>
 * Water can only flow in four directions (up, down, left, or right) from a cell to another one with height
 * equal or lower.
 * <p>
 * Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
 * <p>
 * Note:
 * <p>
 * The order of returned grid coordinates does not matter.
 * Both m and n are less than 150.
 */
public class Problem25_PacificAtlanticWaterFlow {

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        // List to store the result
        List<List<Integer>> result = new ArrayList<>();
        // Base case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        // Rows and columns of the grid
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Matrices to store the cells which can be reached
        // from pacific and atlantic oceans
        int[][] pacific = new int[rows][columns];
        int[][] atlantic = new int[rows][columns];
        // Traverse for top and bottom rows
        for (int column = 0; column < columns; column++) {
            dfs(matrix, 0, column, Integer.MIN_VALUE, pacific);
            dfs(matrix, rows - 1, column, Integer.MIN_VALUE, atlantic);
        }
        // Traverse for left and right columns
        for (int row = 0; row < rows; row++) {
            dfs(matrix, row, 0, Integer.MIN_VALUE, pacific);
            dfs(matrix, row, columns - 1, Integer.MIN_VALUE, atlantic);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (pacific[i][j] == 1 && atlantic[i][j] == 1) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    private void dfs(int[][] matrix, int row, int column, int previousValue, int[][] ocean) {
        // Base condition
        if (row < 0 || row > matrix.length - 1 || column < 0 || column > matrix[0].length - 1) {
            return;
        } else if (matrix[row][column] < previousValue) {
            return;
        } else if (ocean[row][column] == 1) {
            return;
        }
        ocean[row][column] = 1;
        // Call dfs recursively
        dfs(matrix, row - 1, column, matrix[row][column], ocean);
        dfs(matrix, row + 1, column, matrix[row][column], ocean);
        dfs(matrix, row, column - 1, matrix[row][column], ocean);
        dfs(matrix, row, column + 1, matrix[row][column], ocean);
    }
}
