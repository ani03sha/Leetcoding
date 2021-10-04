package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0
 * represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water,
 * and there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island.
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
 * Determine the perimeter of the island.
 * <p>
 * Constraints:
 * <p>
 * row == grid.length
 * col == grid[i].length
 * 1 <= row, col <= 100
 * grid[i][j] is 0 or 1.
 * There is exactly one island in grid.
 */
public class Problem04_IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Variable to store the final perimeter
        int perimeter = 0;
        // Loop through every cell of the array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Add 4 for the current cell if it is 1
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    // Now check for the neighbors of this cell
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}
