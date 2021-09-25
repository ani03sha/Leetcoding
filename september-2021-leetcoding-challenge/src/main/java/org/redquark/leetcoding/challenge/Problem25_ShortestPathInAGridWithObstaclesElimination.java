package org.redquark.leetcoding.challenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an m x n integer matrix grid where each cell is either 0 (empty) or 1 (obstacle).
 * You can move up, down, left, or right from and to an empty cell in one step.
 * <p>
 * Return the minimum number of steps to walk from the upper left corner (0, 0) to the lower right corner
 * (m - 1, n - 1) given that you can eliminate at most k obstacles.
 * <p>
 * If it is not possible to find such walk return -1.
 * <p>
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 40
 * 1 <= k <= m * n
 * grid[i][j] == 0 or 1
 * grid[0][0] == grid[m - 1][n - 1] == 0
 */
public class Problem25_ShortestPathInAGridWithObstaclesElimination {

    public int shortestPath(int[][] grid, int k) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the matrix
        int m = grid.length;
        int n = grid[0].length;
        // Array denoting directions
        int[][] directions = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };
        // Minimum obstacles encountered to reach each cell
        int[][] minimumObstacles = new int[m][n];
        // Array to mark visited nodes
        boolean[][] visited = new boolean[m][n];
        // Queue for BFS
        Queue<int[]> cells = new LinkedList<>();
        // Add cell coordinates and obstacle count in the queue for
        // the very first cell
        cells.add(new int[]{0, 0, grid[0][0]});
        // Obstacle count for the first cell
        minimumObstacles[0][0] = grid[0][0];
        // Levels
        int level = 1;
        // Loop until the queue is empty
        while (!cells.isEmpty()) {
            // Get the nodes at the current level
            int size = cells.size();
            // Loop for all the cells at the given level
            for (int i = 0; i < size; i++) {
                // Get the first node in the level
                int[] head = cells.poll();
                if (head != null) {
                    // If it is the last cell
                    if (head[0] == m - 1 && head[1] == n - 1) {
                        return level - 1;
                    }
                    // Current obstacle count
                    int currentObstacleCount = head[2];
                    // Check for all four directions
                    for (int[] direction : directions) {
                        // Calculate x anf y coordinates
                        int x = head[0] + direction[0];
                        int y = head[1] + direction[1];
                        // Check if we are within limits
                        if (x < 0 || x >= m || y < 0 || y >= n) {
                            continue;
                        }
                        // Get old obstacle count
                        int oldObstacleCount = minimumObstacles[x][y];
                        // Calculate new obstacle count
                        int newObstacleCount = currentObstacleCount + grid[x][y];
                        // If we have not visited the cell and the new obstacle
                        // count is within the limits of k
                        if (!visited[x][y] && newObstacleCount <= k) {
                            cells.add(new int[]{x, y, newObstacleCount});
                            minimumObstacles[x][y] = newObstacleCount;
                            visited[x][y] = true;
                        }
                        if (oldObstacleCount > newObstacleCount && newObstacleCount <= k) {
                            cells.add(new int[]{x, y, newObstacleCount});
                            minimumObstacles[x][y] = newObstacleCount;
                            visited[x][y] = true;
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
