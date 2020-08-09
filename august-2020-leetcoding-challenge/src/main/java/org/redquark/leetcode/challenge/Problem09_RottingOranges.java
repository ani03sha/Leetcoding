package org.redquark.leetcode.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * In a given grid, each cell can have one of three values:
 * <p>
 * - the value 0 representing an empty cell;
 * - the value 1 representing a fresh orange;
 * - the value 2 representing a rotten orange.
 * <p>
 * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes
 * rotten.
 * <p>
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.
 * If this is impossible, return -1 instead.
 * <p>
 * Note:
 * <p>
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] is only 0, 1, or 2.
 */
public class Problem09_RottingOranges {

    /**
     * @param grid - cells representing oranges position
     * @return number of minutes after all cells have rotten oranges
     */
    public int orangesRotting(int[][] grid) {
        // Sets that will contain the coordinates of fresh and rotten oranges
        Set<String> fresh = new HashSet<>();
        Set<String> rotten = new HashSet<>();
        // Loop through all the sets to store the coordinates of fresh
        // and rotten oranges
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    fresh.add("" + i + j);
                } else if (grid[i][j] == 2) {
                    rotten.add("" + i + j);
                }
            }
        }
        // Number of minutes taken to become all the oranges rotten
        int minutes = 0;
        // Four directions
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        // Loop until we have fresh oranges
        while (fresh.size() > 0) {
            // This set will contain the infected oranges in this iteration
            Set<String> infected = new HashSet<>();
            for (String s : rotten) {
                // Get x and y coordinates
                int x = s.charAt(0) - '0';
                int y = s.charAt(1) - '0';
                // Check for every direction
                for (int[] direction : directions) {
                    int nextX = x + direction[0];
                    int nextY = y + direction[1];
                    if (fresh.contains("" + nextX + nextY)) {
                        fresh.remove("" + nextX + nextY);
                        infected.add("" + nextX + nextY);
                    }
                }
            }
            // If we have not infected any orange then we can terminate the loop
            if (infected.size() == 0) {
                return -1;
            }
            // Else we will update the state of rotten oranges
            rotten = infected;
            minutes++;
        }
        return minutes;
    }
}
