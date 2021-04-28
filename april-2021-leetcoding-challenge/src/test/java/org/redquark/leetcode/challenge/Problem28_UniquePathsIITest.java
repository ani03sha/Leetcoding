package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_UniquePathsIITest {

    private final Problem28_UniquePathsII testObject = new Problem28_UniquePathsII();

    @Test
    void testUniquePathsWithObstacles() {
        int[][] obstacleGrid = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        assertEquals(2, testObject.uniquePathsWithObstacles(obstacleGrid));

        obstacleGrid = new int[][]{
                {0, 1},
                {0, 0}
        };
        assertEquals(1, testObject.uniquePathsWithObstacles(obstacleGrid));
    }
}