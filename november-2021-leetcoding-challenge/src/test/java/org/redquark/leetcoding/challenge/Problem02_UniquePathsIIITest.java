package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_UniquePathsIIITest {

    private final Problem02_UniquePathsIII testObject = new Problem02_UniquePathsIII();

    @Test
    void testUniquePathsIII() {
        int[][] grid = new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}
        };
        assertEquals(2, testObject.uniquePathsIII(grid));

        grid = new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 2}
        };
        assertEquals(4, testObject.uniquePathsIII(grid));

        grid = new int[][]{
                {0, 1},
                {2, 0}
        };
        assertEquals(0, testObject.uniquePathsIII(grid));
    }
}