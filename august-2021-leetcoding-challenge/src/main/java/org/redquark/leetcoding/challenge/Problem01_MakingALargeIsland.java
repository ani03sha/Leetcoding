package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an n x n binary matrix grid. You are allowed to change at most one 0 to be 1.
 * <p>
 * Return the size of the largest island in grid after applying this operation.
 * <p>
 * An island is a 4-directionally connected group of 1s.
 * <p>
 * Constraints:
 * <p>
 * n == grid.length
 * n == grid[i].length
 * 1 <= n <= 500
 * grid[i][j] is either 0 or 1.
 */
public class Problem01_MakingALargeIsland {

    public int largestIsland(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Order of the grid
        int n = grid.length;
        // Map to store the mapping of id and total area
        Map<Integer, Integer> gridMap = new HashMap<>();
        // For all zeroes, we cannot have any area
        gridMap.put(0, 0);
        // We will start the gridId from 2 as 0 and 1 are already
        // present in the grid as its elements
        int gridId = 2;
        // Loop through every cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Get the area of the island which includes current cell
                int area = getArea(grid, i, j, gridId);
                // Put this area with the gridId in the map
                gridMap.put(gridId, area);
                // Update the grid id
                gridId++;
            }
        }
        // The variable to store the final area which should be
        // equal to the area corresponding to the first 1 by default
        int finalArea = gridMap.getOrDefault(2, 0);
        // Loop through the grid again
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Since we only need to make one zero as one, therefore,
                // we will check only for the zeroes
                if (grid[i][j] == 0) {
                    // Set to avoid traversing the already visited cell
                    Set<Integer> visited = new HashSet<>();
                    visited.add(i > 0 ? grid[i - 1][j] : 0);
                    visited.add(i < n - 1 ? grid[i + 1][j] : 0);
                    visited.add(j > 0 ? grid[i][j - 1] : 0);
                    visited.add(j < n - 1 ? grid[i][j + 1] : 0);
                    // Current area, including the current cell
                    int area = 1;
                    for (Integer id : visited) {
                        area += gridMap.get(id);
                    }
                    // Update the final area, if required
                    finalArea = Math.max(finalArea, area);
                }
            }
        }
        return finalArea;
    }

    private int getArea(int[][] grid, int i, int j, int gridId) {
        // Base condition
        if (i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != 1) {
            return 0;
        }
        // Update the grid with the id
        grid[i][j] = gridId;
        // Use DFS to check for neighbors of current cell
        return 1 + getArea(grid, i + 1, j, gridId)
                + getArea(grid, i, j + 1, gridId)
                + getArea(grid, i - 1, j, gridId)
                + getArea(grid, i, j - 1, gridId);
    }
}
