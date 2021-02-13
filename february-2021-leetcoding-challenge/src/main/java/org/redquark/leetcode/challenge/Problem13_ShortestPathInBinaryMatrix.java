package org.redquark.leetcode.challenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * In an N by N square grid, each cell is either empty (0) or blocked (1).
 * <p>
 * A clear path from top-left to bottom-right has length k if and only if it is composed
 * of cells C_1, C_2, ..., C_k such that:
 * <p>
 * Adjacent cells C_i and C_{i+1} are connected 8-directionally (ie., they are different
 * and share an edge or corner)
 * - C_1 is at location (0, 0) (ie. has value grid[0][0])
 * - C_k is at location (N-1, N-1) (ie. has value grid[N-1][N-1])
 * - If C_i is located at (r, c), then grid[r][c] is empty (ie. grid[r][c] == 0).
 * <p>
 * Return the length of the shortest such clear path from top-left to bottom-right.
 * If such a path does not exist, return -1.
 * <p>
 * Note:
 * <p>
 * 1 <= grid.length == grid[0].length <= 100
 * grid[r][c] is 0 or 1
 */
public class Problem13_ShortestPathInBinaryMatrix {

    /**
     * @param grid 2-D binary matrix
     * @return shortest path
     */
    public int shortestPathBinaryMatrix(int[][] grid) {
        // Rows and columns of the grid
        int rows = grid.length;
        int columns = grid[0].length;
        // Special case
        if (grid[0][0] == 1 || grid[rows - 1][columns - 1] == 1) {
            return -1;
        }
        // Directions
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, -1}, {-1, 1}, {-1, -1}, {1, 1}};
        // Visited array which keeps track of all the cells
        // that have been visited
        boolean[][] visited = new boolean[rows][columns];
        // Update the source position
        visited[0][0] = true;
        // Queue to store coordinates of the cells
        Queue<int[]> coordinates = new LinkedList<>();
        // Add the first cell to the queue
        coordinates.add(new int[]{0, 0});
        // Shortest distance
        int distance = 0;
        // Loop until the queue is empty
        while (!coordinates.isEmpty()) {
            // Get the size of the queue
            int size = coordinates.size();
            // Loop for all the cells stored in the queue
            for (int i = 0; i < size; i++) {
                // Get the element from the front
                int[] current = coordinates.remove();
                // Check if we have reached to the end of the grid
                if (current[0] == rows - 1 && current[1] == columns - 1) {
                    return distance + 1;
                }
                // Otherwise check for the eight directions
                for (int j = 0; j < 8; j++) {
                    // Next coordinates
                    int nextX = directions[j][0] + current[0];
                    int nextY = directions[j][1] + current[1];
                    // Visit this cell if not already
                    if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < columns
                            && !visited[nextX][nextY] && grid[nextX][nextY] == 0) {
                        coordinates.add(new int[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                    }
                }
            }
            distance++;
        }
        return -1;
    }
}
