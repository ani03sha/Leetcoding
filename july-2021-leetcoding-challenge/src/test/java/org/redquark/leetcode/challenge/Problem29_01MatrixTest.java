package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem29_01MatrixTest {

    private final Problem29_01Matrix testObject = new Problem29_01Matrix();

    @Test
    void testUpdateMatrix() {
        int[][] matrix = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int[][] expected = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        assertArrayEquals(expected, testObject.updateMatrix(matrix));

        matrix = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        expected = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        };
        assertArrayEquals(expected, testObject.updateMatrix(matrix));
    }
}