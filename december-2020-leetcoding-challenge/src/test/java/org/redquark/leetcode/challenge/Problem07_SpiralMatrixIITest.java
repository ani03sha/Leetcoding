package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem07_SpiralMatrixIITest {

    private final Problem07_SpiralMatrixII testObject = new Problem07_SpiralMatrixII();

    @Test
    void testGenerateMatrix() {
        int[][] expected = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        assertArrayEquals(expected, testObject.generateMatrix(3));

        expected = new int[][]{{1}};
        assertArrayEquals(expected, testObject.generateMatrix(1));
    }
}