package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_KthSmallestElementInASortedMatrixTest {

    private final Problem07_KthSmallestElementInASortedMatrix testObject = new Problem07_KthSmallestElementInASortedMatrix();

    @Test
    void testKthSmallest() {
        int[][] matrix = new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        assertEquals(13, testObject.kthSmallest(matrix, k));

        matrix = new int[][]{
                {-5}
        };
        k = 1;
        assertEquals(-5, testObject.kthSmallest(matrix, k));
    }
}