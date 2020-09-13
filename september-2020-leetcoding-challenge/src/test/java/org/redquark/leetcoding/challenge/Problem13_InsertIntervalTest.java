package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem13_InsertIntervalTest {

    private final Problem13_InsertInterval testObject = new Problem13_InsertInterval();

    @Test
    void testInsert() {
        int[][] intervals = new int[][]{{1, 3}, {6, 9}};
        int[] newInterval = new int[]{2, 5};
        int[][] expected = new int[][]{{1, 5}, {6, 9}};
        assertArrayEquals(expected, testObject.insert(intervals, newInterval));

        intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        newInterval = new int[]{4, 8};
        expected = new int[][]{{1, 2}, {3, 10}, {12, 16}};
        assertArrayEquals(expected, testObject.insert(intervals, newInterval));
    }
}