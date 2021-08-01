package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_MakingALargeIslandTest {

    private final Problem01_MakingALargeIsland testObject = new Problem01_MakingALargeIsland();

    @Test
    void testLargestIsland() {
        int[][] grid = new int[][]{
                {1, 0},
                {0, 1}
        };
        assertEquals(3, testObject.largestIsland(grid));

        grid = new int[][]{
                {1, 1},
                {1, 0}
        };
        assertEquals(4, testObject.largestIsland(grid));

        grid = new int[][]{
                {1, 1},
                {1, 1}
        };
        assertEquals(4, testObject.largestIsland(grid));
    }
}