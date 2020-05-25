package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_UncrossedLinesTest {

    private final Problem25_UncrossedLines testObject = new Problem25_UncrossedLines();

    @Test
    void testMaxUncrossedLines() {
        int[] A = new int[]{1, 4, 2};
        int[] B = new int[]{1, 2, 4};
        assertEquals(2, testObject.maxUncrossedLines(A, B));

        A = new int[]{2, 5, 1, 2, 5};
        B = new int[]{10, 5, 2, 1, 5, 2};
        assertEquals(3, testObject.maxUncrossedLines(A, B));

        A = new int[]{1, 3, 7, 1, 7, 5};
        B = new int[]{1, 9, 2, 5, 1};
        assertEquals(2, testObject.maxUncrossedLines(A, B));
    }
}