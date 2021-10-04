package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_IslandPerimeterTest {

    private final Problem04_IslandPerimeter testObject = new Problem04_IslandPerimeter();

    @Test
    void testIslandPerimeter() {
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        assertEquals(16, testObject.islandPerimeter(grid));

        grid = new int[][]{
                {1}
        };
        assertEquals(4, testObject.islandPerimeter(grid));

        grid = new int[][]{
                {1, 0}
        };
        assertEquals(4, testObject.islandPerimeter(grid));
    }
}