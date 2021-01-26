package org.redquark.leetcoding.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * You are a hiker preparing for an upcoming hike. You are given heights, a 2D array
 * of size rows x columns, where heights[row][col] represents the height of cell (row, col).
 * <p>
 * You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right
 * cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and
 * you wish to find a route that requires the minimum effort.
 * <p>
 * A route's effort is the maximum absolute difference in heights between two consecutive
 * cells of the route.
 * <p>
 * Return the minimum effort required to travel from the top-left cell to the bottom-right cell.
 * <p>
 * Constraints:
 * <p>
 * rows == heights.length
 * columns == heights[i].length
 * 1 <= rows, columns <= 100
 * 1 <= heights[i][j] <= 10^6
 */
public class Problem26_PathWithMinimumEffort {

    /**
     * @param heights - heights of cell
     * @return minimum effort
     */
    public int minimumEffortPath(int[][] heights) {
        // Rows and columns
        int rows = heights.length;
        int columns = heights[0].length;
        // Directions
        int[] directions = {0, 1, 0, -1, 0};
        // Array to define maximum absolute to reach cell (i,j)
        int[][] differences = new int[rows][columns];
        // Min heap
        Queue<Cell> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.d));
        // Fill the array
        Arrays.stream(differences).forEach(row -> Arrays.fill(row, Integer.MAX_VALUE));
        // Initialize the array
        differences[0][0] = 0;
        // Initialize the priority queue
        minHeap.offer(new Cell(0, 0, differences[0][0]));
        // Loop until the queue is empty
        while (!minHeap.isEmpty()) {
            // Get the current values
            Cell cell = minHeap.poll();
            int i = cell.i;
            int j = cell.j;
            int d = cell.d;
            // For last cell
            if (i == rows - 1 && j == columns - 1) {
                return d;
            }
            for (int k = 0; k < 4; k++) {
                final int x = i + directions[k];
                final int y = j + directions[k + 1];
                // For invalid row and column
                if (x >= 0 && x < rows && y >= 0 && y < columns) {
                    final int newDifference = Math.abs(heights[i][j] - heights[x][y]);
                    final int maxDifference = Math.max(differences[i][j], newDifference);
                    if (differences[x][y] > maxDifference) {
                        differences[x][y] = maxDifference;
                        minHeap.offer(new Cell(x, y, maxDifference));
                    }
                }
            }
        }
        throw new IllegalArgumentException();
    }

    static class Cell {
        private final int i;
        private final int j;
        // Max difference of i,j and its neighbors
        private final int d;

        Cell(int i, int j, int d) {
            this.i = i;
            this.j = j;
            this.d = d;
        }
    }
}
