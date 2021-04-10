package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_LongestIncreasingPathInAMatrixTest {

    private final Problem10_LongestIncreasingPathInAMatrix testObject =
            new Problem10_LongestIncreasingPathInAMatrix();

    @Test
    void testLongestIncreasingPath() {
        int[][] matrix = new int[][]{
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };
        assertEquals(4, testObject.longestIncreasingPath(matrix));

        matrix = new int[][]{
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}
        };
        assertEquals(4, testObject.longestIncreasingPath(matrix));

        matrix = new int[][]{{1}};
        assertEquals(1, testObject.longestIncreasingPath(matrix));
    }
}