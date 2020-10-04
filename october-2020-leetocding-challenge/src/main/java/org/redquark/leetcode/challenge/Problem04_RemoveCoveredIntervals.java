package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a list of intervals, remove all intervals that are covered by another interval in the list.
 * <p>
 * Interval [a,b) is covered by interval [c,d) if and only if c <= a and b <= d.
 * <p>
 * After doing so, return the number of remaining intervals.
 * <p>
 * nstraints:
 * <p>
 * 1 <= intervals.length <= 1000
 * intervals[i].length == 2
 * 0 <= intervals[i][0] < intervals[i][1] <= 10^5
 * All the intervals are unique.
 */
public class Problem04_RemoveCoveredIntervals {

    /**
     * @param intervals - input intervals
     * @return number of intervals remaining
     */
    public int removeCoveredIntervals(int[][] intervals) {
        // Sort the intervals based on their start value
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // Current interval
        int[] current = {-1, -1};
        // Number of intervals left
        int result = 0;
        // Iterate through the given intervals array
        for (int[] interval : intervals) {
            if (interval[0] > current[0] && interval[1] > current[1]) {
                current[0] = interval[0];
                result++;
            }
            current[1] = Math.max(current[1], interval[1]);
        }
        return result;
    }
}
