package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem23_SearchA2DMatrixIITest {

    private final Problem23_SearchA2DMatrixII testObject = new Problem23_SearchA2DMatrixII();

    @Test
    void testSearchMatrix() {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        assertTrue(testObject.searchMatrix(matrix, target));

        target = 20;
        assertFalse(testObject.searchMatrix(matrix, target));
    }
}