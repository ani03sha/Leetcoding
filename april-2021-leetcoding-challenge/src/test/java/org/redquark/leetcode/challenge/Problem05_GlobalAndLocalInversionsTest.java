package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem05_GlobalAndLocalInversionsTest {

    private final Problem05_GlobalAndLocalInversions testObject = new Problem05_GlobalAndLocalInversions();

    @Test
    void testIsIdealPermutation() {
        int[] A = new int[]{1, 0, 2};
        assertTrue(testObject.isIdealPermutation(A));

        A = new int[]{1, 2, 0};
        assertFalse(testObject.isIdealPermutation(A));
    }
}