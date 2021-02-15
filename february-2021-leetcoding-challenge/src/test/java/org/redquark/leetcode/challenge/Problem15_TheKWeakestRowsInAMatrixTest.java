package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem15_TheKWeakestRowsInAMatrixTest {

    private final Problem15_TheKWeakestRowsInAMatrix testObject = new Problem15_TheKWeakestRowsInAMatrix();

    @Test
    void testKWeakestRows() {
        int[][] matrix = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;
        int[] expected = new int[]{2, 0, 3};
        assertArrayEquals(expected, testObject.kWeakestRows(matrix, k));

        matrix = new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        k = 2;
        expected = new int[]{0, 2};
        assertArrayEquals(expected, testObject.kWeakestRows(matrix, k));
    }
}