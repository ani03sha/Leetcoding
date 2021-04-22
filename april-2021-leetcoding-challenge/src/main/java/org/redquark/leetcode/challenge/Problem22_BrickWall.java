package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * There is a brick wall in front of you. The wall is rectangular and has several rows of bricks.
 * The bricks have the same height but different width.
 * <p>
 * You want to draw a vertical line from the top to the bottom and cross the least bricks.
 * <p>
 * The brick wall is represented by a list of rows. Each row is a list of integers representing
 * the width of each brick in this row from left to right.
 * <p>
 * If your line go through the edge of a brick, then the brick is not considered as crossed.
 * You need to find out how to draw the line to cross the least bricks and return the number
 * of crossed bricks.
 * <p>
 * You cannot draw a line just along one of the two vertical edges of the wall, in which case
 * the line will obviously cross no bricks.
 * <p>
 * Note:
 * <p>
 * The width sum of bricks in different rows are the same and won't exceed INT_MAX.
 * The number of bricks in each row is in range [1,10,000].
 * The height of wall is in range [1,10,000]. Total number of bricks of the wall won't exceed 20,000.
 */
public class Problem22_BrickWall {

    public int leastBricks(List<List<Integer>> wall) {
        // Base cases
        if (wall == null || wall.size() == 0) {
            return 0;
        }
        // Count of bricks to cut through
        int count = 0;
        // Map to store the edge indices in the wall
        // and their frequencies
        Map<Integer, Integer> edgeIndices = new HashMap<>();
        // Loop through all rows
        for (List<Integer> row : wall) {
            // Variable to store end indices
            int endIndex = 0;
            // Loop through all the bricks except last one
            for (int i = 0; i < row.size() - 1; i++) {
                endIndex += row.get(i);
                // Put it in the map with frequency
                edgeIndices.put(endIndex, edgeIndices.getOrDefault(endIndex, 0) + 1);
                // Get maximum count
                count = Math.max(count, edgeIndices.get(endIndex));
            }
        }
        return wall.size() - count;
    }
}
