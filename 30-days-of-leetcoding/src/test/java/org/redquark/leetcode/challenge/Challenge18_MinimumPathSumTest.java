package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge18_MinimumPathSumTest {

    private final Challenge18_MinimumPathSum testObject = new Challenge18_MinimumPathSum();

    @Test
    void minPathSum() {
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertEquals(7, testObject.minPathSum(grid));
    }
}