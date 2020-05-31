package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem30_KClosestPointsToOriginTest {

    private final Problem30_KClosestPointsToOrigin testObject = new Problem30_KClosestPointsToOrigin();

    @Test
    void testKClosest() {
        int[][] points = new int[][]{{1, 3}, {-2, 2}};
        int K = 1;
        int[][] expected = new int[][]{{-2, 2}};
        assertArrayEquals(expected, testObject.kClosest(points, K));

        points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        K = 2;
        expected = new int[][]{{3, 3}, {-2, 4}};
        assertArrayEquals(expected, testObject.kClosest(points, K));
    }
}