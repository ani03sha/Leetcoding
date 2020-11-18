package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * <p>
 * Constraints:
 * <p>
 * 1 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 10^4
 */
public class Problem18_MergeIntervals {

    /**
     * @param intervals - input array of intervals
     * @return merged intervals
     */
    public int[][] merge(int[][] intervals) {
        // Base case
        if (intervals.length <= 1) {
            return intervals;
        }
        // Sort the array
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // Resultant list
        List<int[]> result = new ArrayList<>();
        // Current interval
        int[] currentInterval = intervals[0];
        // Add this to the list
        result.add(currentInterval);
        // Loop for all the remaining intervals
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];
            if (currentEnd >= nextBegin) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
