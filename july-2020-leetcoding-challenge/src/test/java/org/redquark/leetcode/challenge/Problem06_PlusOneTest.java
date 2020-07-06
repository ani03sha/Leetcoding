package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem06_PlusOneTest {

    private final Problem06_PlusOne testObject = new Problem06_PlusOne();

    @Test
    void testPlusOne() {
        int[] digits = new int[]{1, 2, 9, 9};
        int[] expected = new int[]{1, 3, 0, 0};
        assertArrayEquals(expected, testObject.plusOne(digits));

        digits = new int[]{9, 9, 9, 9};
        expected = new int[]{1, 0, 0, 0, 0};
        assertArrayEquals(expected, testObject.plusOne(digits));

        digits = new int[]{0, 2, 3, 9};
        expected = new int[]{0, 2, 4, 0};
        assertArrayEquals(expected, testObject.plusOne(digits));

        digits = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9};
        expected = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, testObject.plusOne(digits));

        digits = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        expected = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
        assertArrayEquals(expected, testObject.plusOne(digits));
    }
}