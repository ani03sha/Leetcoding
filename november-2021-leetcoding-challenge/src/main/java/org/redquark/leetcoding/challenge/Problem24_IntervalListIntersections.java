package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given two lists of closed intervals, firstList and secondList, where firstList[i] = [starti, endi]
 * and secondList[j] = [startj, endj]. Each list of intervals is pairwise disjoint and in sorted order.
 * <p>
 * Return the intersection of these two interval lists.
 * <p>
 * A closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.
 * <p>
 * The intersection of two closed intervals is a set of real numbers that are either empty or represented as a
 * closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].
 * <p>
 * Constraints:
 * <p>
 * 0 <= firstList.length, secondList.length <= 1000
 * firstList.length + secondList.length >= 1
 * 0 <= starti < endi <= 10^9
 * endi < starti+1
 * 0 <= startj < endj <= 10^9
 * endj < startj+1
 */
public class Problem24_IntervalListIntersections {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        // List to store the intersection of intervals
        List<int[]> intersectionList = new ArrayList<>();
        if (firstList == null || firstList.length == 0 || secondList == null || secondList.length == 0) {
            return intersectionList.toArray(new int[0][]);
        }
        // Pointers to traverse through the list
        int i = 0;
        int j = 0;
        // Loop through both lists
        while (i < firstList.length && j < secondList.length) {
            // Get the start and end pointers
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            // If start and end represent valid interval
            if (start <= end) {
                intersectionList.add(new int[]{start, end});
            }
            // If the end of first list is smaller than the end of
            // the second list
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return intersectionList.toArray(new int[intersectionList.size()][]);
    }
}
