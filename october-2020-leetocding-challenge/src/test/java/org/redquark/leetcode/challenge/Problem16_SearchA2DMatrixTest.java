package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem16_SearchA2DMatrixTest {

    private final Problem16_SearchA2DMatrix testObject = new Problem16_SearchA2DMatrix();

    @Test
    void testSearchMatrix() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target = 3;
        assertTrue(testObject.searchMatrix(matrix, target));

        matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        target = 13;
        assertFalse(testObject.searchMatrix(matrix, target));

        matrix = new int[][]{};
        target = 0;
        assertFalse(testObject.searchMatrix(matrix, target));
    }
}