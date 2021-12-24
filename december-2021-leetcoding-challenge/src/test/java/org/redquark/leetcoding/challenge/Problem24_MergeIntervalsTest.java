package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem24_MergeIntervalsTest {

    private final Problem24_MergeIntervals testObject = new Problem24_MergeIntervals();

    @Test
    void testMerge() {
        int[][] intervals = new int[][]{
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] expected = new int[][]{
                {1, 6},
                {8, 10},
                {15, 18}
        };
        assertArrayEquals(expected, testObject.merge(intervals));

        intervals = new int[][]{
                {1, 4},
                {4, 5}
        };
        expected = new int[][]{
                {1, 5}
        };
        assertArrayEquals(expected, testObject.merge(intervals));
    }
}