package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_ShortestPathInAGridWithObstaclesEliminationTest {

    private final Problem25_ShortestPathInAGridWithObstaclesElimination testObject =
            new Problem25_ShortestPathInAGridWithObstaclesElimination();

    @Test
    void testShortestPath() {
        int[][] grid = new int[][]{
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 0}
        };
        int k = 1;
        assertEquals(6, testObject.shortestPath(grid, k));

        grid = new int[][]{
                {0, 1, 1},
                {1, 1, 1},
                {1, 0, 0}
        };
        assertEquals(-1, testObject.shortestPath(grid, k));
    }
}