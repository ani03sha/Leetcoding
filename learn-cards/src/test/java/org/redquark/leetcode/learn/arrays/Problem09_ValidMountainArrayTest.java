package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem09_ValidMountainArrayTest {

    private final Problem09_ValidMountainArray testObject = new Problem09_ValidMountainArray();

    @Test
    void validMountainArray() {
        int[] A = new int[]{2, 1};
        assertFalse(testObject.validMountainArray(A));

        A = new int[]{3, 5, 5};
        assertFalse(testObject.validMountainArray(A));

        A = new int[]{0, 3, 2, 1};
        assertTrue(testObject.validMountainArray(A));

        A = new int[]{0, 2, 3, 4, 5, 2, 1, 0};
        assertTrue(testObject.validMountainArray(A));

        A = new int[]{0, 2, 3, 3, 5, 2, 1, 0};
        assertFalse(testObject.validMountainArray(A));

        A = new int[]{1, 1, 1};
        assertFalse(testObject.validMountainArray(A));

        A = new int[]{1, 2, 2, 1};
        assertFalse(testObject.validMountainArray(A));

        A = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        assertFalse(testObject.validMountainArray(A));
    }
}