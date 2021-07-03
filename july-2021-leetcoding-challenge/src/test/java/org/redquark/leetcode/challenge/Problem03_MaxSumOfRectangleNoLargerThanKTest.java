package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_MaxSumOfRectangleNoLargerThanKTest {

    private final Problem03_MaxSumOfRectangleNoLargerThanK testObject =
            new Problem03_MaxSumOfRectangleNoLargerThanK();

    @Test
    void testMaxSumSubmatrix() {
        int[][] matrix = new int[][]{
                {1, 0, 1},
                {0, -2, 3}
        };
        int k = 2;
        assertEquals(2, testObject.maxSumSubmatrix(matrix, k));

        matrix = new int[][]{
                {2, 2, -1}
        };
        k = 3;
        assertEquals(3, testObject.maxSumSubmatrix(matrix, k));
    }
}