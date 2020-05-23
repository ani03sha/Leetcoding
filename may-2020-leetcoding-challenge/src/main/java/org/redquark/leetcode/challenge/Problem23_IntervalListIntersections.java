package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.
 * <p>
 * Return the intersection of these two interval lists.
 * <p>
 * (Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.
 * The intersection of two closed intervals is a set of real numbers that is either empty, or can be
 * represented as a closed interval.  For example, the intersection of [1, 3] and [2, 4] is [2, 3].)
 * <p>
 * Note:
 * <p>
 * 0 <= A.length < 1000
 * 0 <= B.length < 1000
 * 0 <= A[i].start, A[i].end, B[i].start, B[i].end < 10^9
 */
public class Problem23_IntervalListIntersections {

    /**
     * @param A - first input list
     * @param B - second input list
     * @return - list of interval objects
     */
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        // This array will store the output list of intervals
        List<int[]> result = new ArrayList<>();
        // Counters
        int i = 0, j = 0;
        // Loop for each element in both the arrays
        while (i < A.length && j < B.length) {
            // Start point of the intersection
            int low = Math.max(A[i][0], B[j][0]);
            // End point of the intersection
            int high = Math.min(A[i][1], B[j][1]);
            // Check if the intersection is valid
            if (low <= high) {
                result.add(new int[]{low, high});
            }
            // Remove the interval with the smallest endpoint
            if (A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
