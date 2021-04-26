package org.redquark.leetcode.challenge;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array heights representing the heights of buildings, some bricks,
 * and some ladders.
 * <p>
 * You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
 * <p>
 * While moving from building i to building i+1 (0-indexed),
 * <p>
 * If the current building's height is greater than or equal to the next building's height,
 * you do not need a ladder or bricks. If the current building's height is less than the next
 * building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.
 * <p>
 * Return the furthest building index (0-indexed) you can reach if you use the given ladders and
 * bricks optimally.
 * <p>
 * Constraints:
 * <p>
 * 1 <= heights.length <= 10^5
 * 1 <= heights[i] <= 10^6
 * 0 <= bricks <= 10^9
 * 0 <= ladders <= heights.length
 */
public class Problem26_FurthestBuildingYouCanReach {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        // Priority queue to store the
        Queue<Integer> minHeap = new PriorityQueue<>();
        // Loop through the heights
        for (int i = 0; i < heights.length - 1; i++) {
            // Get the difference of two adjacent buildings
            int difference = heights[i + 1] - heights[i];
            // If the difference is greater than zero,
            // then we can use ladders, if available
            if (difference > 0) {
                minHeap.add(difference);
            }
            if (minHeap.size() > ladders) {
                if (minHeap.peek() != null) {
                    bricks -= minHeap.poll();
                }
            }
            // If there are no bricks
            if (bricks < 0) {
                return i;
            }
        }
        return heights.length - 1;
    }
}
