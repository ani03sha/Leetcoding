package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * On a 2-dimensional grid, there are 4 types of squares:
 * <p>
 * 1 represents the starting square.  There is exactly one starting square.
 * 2 represents the ending square.  There is exactly one ending square.
 * 0 represents empty squares we can walk over.
 * -1 represents obstacles that we cannot walk over.
 * <p>
 * Return the number of 4-directional walks from the starting square to the ending square,
 * that walk over every non-obstacle square exactly once.
 * <p>
 * Note:
 * <p>
 * 1 <= grid.length * grid[0].length <= 20
 */
public class Problem20_UniquePathsIII {

    private int totalPaths;

    /**
     * @param grid - input grid
     * @return - total number of unique paths
     */
    public int uniquePathsIII(int[][] grid) {
        totalPaths = 0;
        // Dimensions of grid
        int m = grid.length;
        int n = grid[0].length;
        // Count all the zeros in the grid
        int totalZeros = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    totalZeros++;
                }
            }
        }
        // Call dfs as soon as we encounter 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, totalZeros);
                }
            }
        }
        return totalPaths;
    }

    private void dfs(int[][] grid, int i, int j, int totalZeros) {
        // Base conditions
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1
                || grid[i][j] == -1 || (grid[i][j] == 2 && totalZeros != 0) || grid[i][j] == Integer.MAX_VALUE) {
            return;
        }
        // If the condition is met
        if (grid[i][j] == 2 && totalZeros == 0) {
            totalPaths++;
        }
        // If we encounter zero
        if (grid[i][j] == 0) {
            totalZeros--;
        }
        int temp = grid[i][j];
        grid[i][j] = Integer.MAX_VALUE;
        // DFS
        dfs(grid, i + 1, j, totalZeros);
        dfs(grid, i - 1, j, totalZeros);
        dfs(grid, i, j + 1, totalZeros);
        dfs(grid, i, j - 1, totalZeros);
        grid[i][j] = temp;
    }
}
