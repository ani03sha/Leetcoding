package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem26_KClosestPointsToOriginTest {

    private final Problem26_KClosestPointsToOrigin testObject = new Problem26_KClosestPointsToOrigin();

    @Test
    void testKClosest() {
        int[][] points = new int[][]{
                {1, 3},
                {-2, 2}
        };
        int k = 1;
        int[][] expected = new int[][]{
                {-2, 2}
        };
        assertArrayEquals(expected, testObject.kClosest(points, k));

        points = new int[][]{
                {3, 3},
                {5, -1},
                {-2, 4}
        };
        k = 2;
        expected = new int[][]{
                {3, 3},
                {-2, 4}
        };
        assertArrayEquals(expected, testObject.kClosest(points, k));
    }
}