package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_IslandPerimeterTest {

    private final Problem07_IslandPerimeter testObject = new Problem07_IslandPerimeter();

    @Test
    void testIslandPerimeter() {
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        assertEquals(16, testObject.islandPerimeter(grid));
    }
}