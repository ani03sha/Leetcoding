package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 */
public class Challenge17_NumberOfIslands {

    /**
     * @param grid - grid representing land and water
     * @return - number of islands
     * <p>
     * Algorithm:
     * 1. We do not have to check for zeros only ones
     * 2. If we encounter one, it means we have reached an island
     * 3. We sink the island and make its neigbors do the same
     * 4. Return 1 for the original island
     */
    public int numIslands(char[][] grid) {
        // Base condition
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Number of islands counter
        int count = 0;
        // Loop through the entire grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // If we encounter '1', it means we have an island
                if (grid[i][j] == '1') {
                    count += dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    /**
     * @param grid - grid of land and water
     * @param i    - vertical neighbor
     * @param j    - horizontal neighbor
     * @return - count of island for a current element
     */
    private int dfs(char[][] grid, int i, int j) {
        // Base condition
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }
        // Lets sink this island
        grid[i][j] = '0';
        // Recursive calls to the neighbors horizontally and vertically
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        return 1;
    }
}
