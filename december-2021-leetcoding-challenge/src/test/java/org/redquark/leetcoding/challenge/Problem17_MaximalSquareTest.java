package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_MaximalSquareTest {

    private final Problem17_MaximalSquare testObject = new Problem17_MaximalSquare();

    @Test
    void testMaximalSquare() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assertEquals(4, testObject.maximalSquare(matrix));

        matrix = new char[][]{};
        assertEquals(0, testObject.maximalSquare(matrix));

        matrix = new char[][]{{'1'}};
        assertEquals(1, testObject.maximalSquare(matrix));
    }
}