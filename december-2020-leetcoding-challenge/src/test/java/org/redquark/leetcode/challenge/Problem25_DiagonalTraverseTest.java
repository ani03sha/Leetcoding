package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem25_DiagonalTraverseTest {

    private final Problem25_DiagonalTraverse testObject = new Problem25_DiagonalTraverse();

    @Test
    void testFindDiagonalOrder() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9};
        assertArrayEquals(expected, testObject.findDiagonalOrder(matrix));
    }
}