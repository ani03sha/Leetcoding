package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge27_MaximalSquareTest {

    private final Challenge27_MaximalSquare testObject = new Challenge27_MaximalSquare();

    @Test
    void maximalSquare() {
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