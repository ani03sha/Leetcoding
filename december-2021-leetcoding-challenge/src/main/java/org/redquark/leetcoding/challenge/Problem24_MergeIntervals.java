package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an
 * array of the non-overlapping intervals that cover all the intervals in the input.
 * <p>
 * Constraints:
 * <p>
 * 1 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 10^4
 */
public class Problem24_MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // Sort the intervals by their start value
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // List of merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        // Current interval
        int[] currentInterval = intervals[0];
        // Add this interval to the list
        mergedIntervals.add(currentInterval);
        // Loop for each interval
        for (int[] interval : intervals) {
            // Get the end of the current interval
            int currentEnd = currentInterval[1];
            // Get the beginning of the next interval
            int nextBegin = interval[0];
            // Get the end of the next interval
            int nextEnd = interval[1];
            // If the nextBegin is less than or equal to
            // the currentEnd, we should merge the intervals
            if (nextBegin <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }
            // If not, then we will add the next interval in the list
            else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
