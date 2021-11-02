package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an m x n integer array grid where grid[i][j] could be:
 * <p>
 * 1 representing the starting square. There is exactly one starting square.
 * 2 representing the ending square. There is exactly one ending square.
 * 0 representing empty squares we can walk over.
 * -1 representing obstacles that we cannot walk over.
 * <p>
 * Return the number of 4-directional walks from the starting square to the ending square, that walk over every
 * non-obstacle square exactly once.
 * <p>
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 20
 * 1 <= m * n <= 20
 * -1 <= grid[i][j] <= 2
 * There is exactly one starting cell and one ending cell.
 */
public class Problem02_UniquePathsIII {

    public int uniquePathsIII(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the matrix
        int m = grid.length;
        int n = grid[0].length;
        // Starting coordinates
        int x = -1;
        int y = -1;
        // Count of valid cells in the grid which will be equal
        // to the number of zeroes in the grid
        int validCells = 0;
        // Loop over the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the current cell is valid cell, then update
                // the count of valid cells
                if (grid[i][j] == 0) {
                    validCells++;
                }
                // If the current cell is the starting point, update
                // the starting coordinates
                else if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        return dfs(grid, x, y, m, n, validCells);
    }

    private int dfs(int[][] grid, int x, int y, int m, int n, int validCells) {
        // Base case
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == -1) {
            return 0;
        }
        // If we have reached to the ending point
        if (grid[x][y] == 2) {
            return validCells == -1 ? 1 : 0;
        }
        // Mark the current cell as visited
        grid[x][y] = -1;
        // Decrement the count of valid cells
        validCells--;
        // Total paths in all four directions
        int totalPaths = dfs(grid, x - 1, y, m, n, validCells)
                + dfs(grid, x + 1, y, m, n, validCells)
                + dfs(grid, x, y - 1, m, n, validCells)
                + dfs(grid, x, y + 1, m, n, validCells);
        // If we are not able to find the path, we backtrack
        grid[x][y] = 0;
        return totalPaths;
    }
}
