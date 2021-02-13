package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_ShortestPathInBinaryMatrixTest {

    private final Problem13_ShortestPathInBinaryMatrix testObject =
            new Problem13_ShortestPathInBinaryMatrix();

    @Test
    void testShortestPathBinaryMatrix() {
        int[][] grid = new int[][]{{0, 1}, {1, 0}};
        assertEquals(2, testObject.shortestPathBinaryMatrix(grid));

        grid = new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertEquals(4, testObject.shortestPathBinaryMatrix(grid));
    }
}