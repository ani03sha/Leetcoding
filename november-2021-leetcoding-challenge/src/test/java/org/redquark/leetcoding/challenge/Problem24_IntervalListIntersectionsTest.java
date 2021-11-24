package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem24_IntervalListIntersectionsTest {

    private final Problem24_IntervalListIntersections testObject = new Problem24_IntervalListIntersections();

    @Test
    void testIntervalIntersection() {
        int[][] firstList = new int[][]{
                {0, 2},
                {5, 10},
                {13, 23},
                {24, 25}
        };
        int[][] secondList = new int[][]{
                {1, 5},
                {8, 12},
                {15, 24},
                {25, 26}
        };
        int[][] expected = new int[][]{
                {1, 2},
                {5, 5},
                {8, 10},
                {15, 23},
                {24, 24},
                {25, 25}
        };
        assertArrayEquals(expected, testObject.intervalIntersection(firstList, secondList));

        firstList = new int[][]{
                {1, 3},
                {5, 9}
        };
        secondList = new int[][]{};
        expected = new int[][]{};
        assertArrayEquals(expected, testObject.intervalIntersection(firstList, secondList));

        firstList = new int[][]{};
        secondList = new int[][]{
                {4, 8},
                {10, 12}
        };
        expected = new int[][]{};
        assertArrayEquals(expected, testObject.intervalIntersection(firstList, secondList));

        firstList = new int[][]{
                {1, 7}
        };
        secondList = new int[][]{
                {3, 10}
        };
        expected = new int[][]{
                {3, 7}
        };
        assertArrayEquals(expected, testObject.intervalIntersection(firstList, secondList));
    }
}