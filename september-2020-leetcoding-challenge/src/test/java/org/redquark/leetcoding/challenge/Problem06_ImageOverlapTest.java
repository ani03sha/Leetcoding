package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_ImageOverlapTest {

    private final Problem06_ImageOverlap testObject = new Problem06_ImageOverlap();

    @Test
    void testLargestOverlap() {
        int[][] A = {
                {1, 1, 0},
                {0, 1, 0},
                {0, 1, 0}
        };
        int[][] B = {
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 1}
        };
        assertEquals(3, testObject.largestOverlap(A, B));
    }
}