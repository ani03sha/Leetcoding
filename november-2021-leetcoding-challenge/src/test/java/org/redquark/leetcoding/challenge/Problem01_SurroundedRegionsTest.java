package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem01_SurroundedRegionsTest {

    private final Problem01_SurroundedRegions testObject = new Problem01_SurroundedRegions();

    @Test
    void testSolve() {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] expected = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assertArrayEquals(expected, testObject.solve(board));

        board = new char[][]{
                {'X'}
        };
        expected = new char[][]{
                {'X'}
        };
        assertArrayEquals(expected, testObject.solve(board));
    }
}