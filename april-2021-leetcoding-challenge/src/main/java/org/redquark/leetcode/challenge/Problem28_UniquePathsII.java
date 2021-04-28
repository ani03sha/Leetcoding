package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach
 * the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * <p>
 * An obstacle and space is marked as 1 and 0 respectively in the grid.
 * <p>
 * Constraints:
 * <p>
 * m == obstacleGrid.length
 * n == obstacleGrid[i].length
 * 1 <= m, n <= 100
 * obstacleGrid[i][j] is 0 or 1.
 */
public class Problem28_UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Special case
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        // Rows and columns
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;
        // DP array to store the paths
        int[][] paths = new int[rows][columns];
        // Initializing the top left corner, if there
        // is not obstacle present there
        if (obstacleGrid[0][0] == 0) {
            paths[0][0] = 1;
        }
        // First column and first row of the matrix
        for (int i = 1; i < rows; i++) {
            if (obstacleGrid[i][0] == 0) {
                paths[i][0] = paths[i - 1][0];
            }
        }
        for (int j = 1; j < columns; j++) {
            if (obstacleGrid[0][j] == 0) {
                paths[0][j] = paths[0][j - 1];
            }
        }
        // Loop for remaining cells
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (obstacleGrid[i][j] == 0) {
                    paths[i][j] = paths[i][j - 1] + paths[i - 1][j];
                }
            }
        }
        return paths[rows - 1][columns - 1];
    }
}
