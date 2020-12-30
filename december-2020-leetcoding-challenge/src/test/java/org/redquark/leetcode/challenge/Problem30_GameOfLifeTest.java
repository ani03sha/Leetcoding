package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class Problem30_GameOfLifeTest {

    private final Problem30_GameOfLife testObject = new Problem30_GameOfLife();

    @Test
    void testGameOfLife() {
        int[][] board = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        assertArrayEquals(expected, testObject.gameOfLife(board));

        board = new int[][]{{1, 1}, {1, 0}};
        expected = new int[][]{{1, 1}, {1, 1}};
        assertArrayEquals(expected, testObject.gameOfLife(board));

        board = new int[][]{{0, 0}};
        expected = new int[][]{{0, 0}};
        assertArrayEquals(expected, testObject.gameOfLife(board));
    }
}