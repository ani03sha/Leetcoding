package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_NonOverlappingIntervalsTest {

    private final Problem15_NonOverlappingIntervals testObject = new Problem15_NonOverlappingIntervals();

    @Test
    void testEraseOverlapIntervals() {
        int[][] intervals = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertEquals(1, testObject.eraseOverlapIntervals(intervals));

        intervals = new int[][]{{1, 2}, {1, 2}, {1, 2}};
        assertEquals(2, testObject.eraseOverlapIntervals(intervals));

        intervals = new int[][]{{1, 2}, {2, 3}};
        assertEquals(0, testObject.eraseOverlapIntervals(intervals));
    }
}