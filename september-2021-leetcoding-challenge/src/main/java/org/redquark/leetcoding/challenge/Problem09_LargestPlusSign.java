package org.redquark.leetcoding.challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer n. You have an n x n binary grid with all values initially 1's except for some
 * indices given in the array mines. The ith element of the array mines is defined as mines[i] = [xi, yi]
 * where grid[xi][yi] == 0.
 * <p>
 * Return the order of the largest axis-aligned plus sign of 1's contained in grid. If there is none, return 0.
 * <p>
 * An axis-aligned plus sign of 1's of order k has some center grid[r][c] == 1 along with four arms of length
 * k - 1 going up, down, left, and right, and made of 1's. Note that there could be 0's or 1's beyond the arms
 * of the plus sign, only the relevant area of the plus sign is checked for 1's.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 500
 * 1 <= mines.length <= 5000
 * 0 <= xi, yi < n
 * All the pairs (xi, yi) are unique.
 */
public class Problem09_LargestPlusSign {

    public int orderOfLargestPlusSign(int n, int[][] mines) {
        // Special case
        if (n <= 0 || mines == null || mines.length == 0) {
            return n;
        }
        // Set to store the banned cells in the form of string
        Set<String> bannedCells = new HashSet<>();
        // Populate the set
        for (int[] mine : mines) {
            bannedCells.add(Arrays.toString(mine));
        }
        // Lookup table to store the maximum order until for a cell
        int[][] lookup = new int[n][n];
        // Count of a row or for a column
        int count;
        // Loop for the rows
        for (int i = 0; i < n; i++) {
            // Reset count
            count = 0;
            // Loop from left to right
            for (int j = 0; j < n; j++) {
                // Check if the current cell is not the banned cell
                if (bannedCells.contains(Arrays.toString(new int[]{i, j}))) {
                    // Reset count
                    count = 0;
                } else {
                    count++;
                }
                // Update the lookup table
                lookup[i][j] = count;
            }
            // Reset the count
            count = 0;
            // Loop from right to left
            for (int j = n - 1; j >= 0; j--) {
                // Check if the current cell is not the banned cell
                if (bannedCells.contains(Arrays.toString(new int[]{i, j}))) {
                    // Reset count
                    count = 0;
                } else {
                    count++;
                }
                // Update the lookup table
                lookup[i][j] = Math.min(lookup[i][j], count);
            }
        }
        // Loop for the columns
        for (int i = 0; i < n; i++) {
            // Reset count
            count = 0;
            // Move from top to bottom
            for (int j = 0; j < n; j++) {
                // Check if the current cell is not the banned cell
                if (bannedCells.contains(Arrays.toString(new int[]{j, i}))) {
                    // Reset count
                    count = 0;
                } else {
                    count++;
                }
                // Update the lookup table
                lookup[j][i] = Math.min(lookup[j][i], count);
            }
            // Reset count
            count = 0;
            // Move from bottom to top
            for (int j = n - 1; j >= 0; j--) {
                // Check if the current cell is not the banned cell
                if (bannedCells.contains(Arrays.toString(new int[]{j, i}))) {
                    // Reset count
                    count = 0;
                } else {
                    count++;
                }
                // Update the lookup table
                lookup[j][i] = Math.min(lookup[j][i], count);
            }
        }
        // Find the maximum order
        int maximumOrder = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maximumOrder = Math.max(maximumOrder, lookup[i][j]);
            }
        }
        return maximumOrder;
    }
}
