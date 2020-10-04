package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_RemoveCoveredIntervalsTest {

    private final Problem04_RemoveCoveredIntervals testObject = new Problem04_RemoveCoveredIntervals();

    @Test
    void testRemoveCoveredIntervals() {
        int[][] intervals = new int[][]{{1, 4}, {3, 6}, {2, 8}};
        assertEquals(2, testObject.removeCoveredIntervals(intervals));

        intervals = new int[][]{{1, 4}, {2, 3}};
        assertEquals(1, testObject.removeCoveredIntervals(intervals));

        intervals = new int[][]{{0, 10}, {5, 12}};
        assertEquals(2, testObject.removeCoveredIntervals(intervals));

        intervals = new int[][]{{3, 10}, {4, 10}, {5, 11}};
        assertEquals(2, testObject.removeCoveredIntervals(intervals));

        intervals = new int[][]{{1, 2}, {1, 4}, {3, 4}};
        assertEquals(1, testObject.removeCoveredIntervals(intervals));
    }
}