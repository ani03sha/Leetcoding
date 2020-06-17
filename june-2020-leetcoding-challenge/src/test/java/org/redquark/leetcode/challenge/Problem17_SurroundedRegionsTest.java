package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem17_SurroundedRegionsTest {

    private final Problem17_SurroundedRegions testObject = new Problem17_SurroundedRegions();

    @Test
    void testSolve() {
        char[][] board = new char[][]
                {
                        {'X', 'X', 'X', 'X'},
                        {'X', 'O', 'O', 'X'},
                        {'X', 'X', 'O', 'X'},
                        {'X', 'O', 'X', 'X'}
                };

        char[][] expected = new char[][]
                {
                        {'X', 'X', 'X', 'X'},
                        {'X', 'X', 'X', 'X'},
                        {'X', 'X', 'X', 'X'},
                        {'X', 'O', 'X', 'X'}
                };

        assertArrayEquals(expected, testObject.solve(board));
    }
}