package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a collection of intervals, find the minimum number of intervals you need to remove to make
 * the rest of the intervals non-overlapping.
 * <p>
 * Note:
 * <p>
 * You may assume the interval's end point is always bigger than its start point.
 * Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.
 */
public class Problem15_NonOverlappingIntervals {

    /**
     * @param intervals - input array of intervals
     * @return number of intervals to be erased
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        // Base condition
        if (intervals.length < 2) {
            return 0;
        }
        // Sort the array based on the starting value of the interval
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // This will store the removal count
        int removalCount = 0;
        // This will store the last included interval's index
        int lastIncluded = 0;
        // Loop through the array
        for (int i = 1; i < intervals.length; i++) {
            // Overlap
            if (intervals[i][0] < intervals[lastIncluded][1]) {
                removalCount++;
                if (intervals[i][1] < intervals[lastIncluded][1]) {
                    lastIncluded = i;
                }
            } else {
                // Update the index of last included to the current index
                lastIncluded = i;
            }
        }
        return removalCount;
    }
}
