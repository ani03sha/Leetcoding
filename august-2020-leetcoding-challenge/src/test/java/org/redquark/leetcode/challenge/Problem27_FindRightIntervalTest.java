package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem27_FindRightIntervalTest {

    private final Problem27_FindRightInterval testObject = new Problem27_FindRightInterval();

    @Test
    void testFindRightInterval() {
        int[][] intervals = {{3, 4}, {2, 3}, {1, 2}};
        int[] expected = {-1, 0, 1};
        assertArrayEquals(expected, testObject.findRightInterval(intervals));
    }
}