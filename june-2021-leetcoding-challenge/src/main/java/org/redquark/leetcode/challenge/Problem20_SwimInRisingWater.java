package org.redquark.leetcode.challenge;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Anirudh Sharma
 * <p>
 * On an N x N grid, each square grid[i][j] represents the elevation at that point (i,j).
 * <p>
 * Now rain starts to fall. At time t, the depth of the water everywhere is t. You can swim from a square
 * to another 4-directionally adjacent square if and only if the elevation of both squares individually are
 * at most t.
 * <p>
 * You can swim infinite distance in zero time. Of course, you must stay within the boundaries of the
 * grid during your swim.
 * <p>
 * You start at the top left square (0, 0). What is the least time until you can reach the bottom right square
 * (N-1, N-1)?
 * <p>
 * Note:
 * <p>
 * 2 <= N <= 50.
 * grid[i][j] is a permutation of [0, ..., N*N - 1].
 */
public class Problem20_SwimInRisingWater {

    public int swimInWater(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Length of the grid
        int n = grid.length;
        // Priority queue for Dijkstra
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        // Visited array
        boolean[][] visited = new boolean[n][n];
        // Array representing directions
        int[][] directions = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
        // Starting from the index 0, 0
        pq.offer(new int[]{0, 0, grid[0][0]});
        visited[0][0] = true;
        // Loop until the queue is empty
        while (!pq.isEmpty()) {
            // Get current element
            int[] current = pq.poll();
            int i = current[0];
            int j = current[1];
            int max = current[2];
            // Loop for all directions
            for (int[] direction : directions) {
                // New coordinates
                int newI = direction[0] + i;
                int newJ = direction[1] + j;
                if (newI < 0 || newJ < 0 || newI >= n || newJ >= n) {
                    continue;
                }
                if (!visited[newI][newJ]) {
                    visited[newI][newJ] = true;
                    int newMax = Math.max(max, grid[newI][newJ]);
                    if (newI == n - 1 && newJ == n - 1) {
                        return newMax;
                    }
                    pq.offer(new int[]{newI, newJ, newMax});
                }
            }
        }
        return 0;
    }
}
