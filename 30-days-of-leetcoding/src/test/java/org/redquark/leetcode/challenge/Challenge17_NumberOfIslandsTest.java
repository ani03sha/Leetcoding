package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge17_NumberOfIslandsTest {

    private final Challenge17_NumberOfIslands testObject = new Challenge17_NumberOfIslands();

    @Test
    void numIslands() {
        char[][] grid = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        assertEquals(1, testObject.numIslands(grid));

        grid = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        assertEquals(3, testObject.numIslands(grid));
    }
}