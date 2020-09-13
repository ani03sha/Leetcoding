package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * <p>
 * You may assume that the intervals were initially sorted according to their start times.
 */
public class Problem13_InsertInterval {

    /**
     * @param intervals   - array of intervals
     * @param newInterval - interval to be inserted
     * @return - resulting list of intervals
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int start = 0;
        int end = intervals.length;
        // When interval[i] < newInterval
        while (start < end && intervals[start][1] < newInterval[0]) {
            result.add(intervals[start]);
            start++;
        }
        // When interval[i] is neither greater than nor less than newInterval
        while (start < end && intervals[start][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[start][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[start][1], newInterval[1]);
            start++;
        }
        result.add(newInterval);
        // When interval[i] > newInterval
        while (start < end) {
            result.add(intervals[start]);
            start++;
        }
        return result.toArray(new int[0][]);
    }
}
