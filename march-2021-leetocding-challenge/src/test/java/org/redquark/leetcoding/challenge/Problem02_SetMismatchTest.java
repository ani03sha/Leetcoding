package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem02_SetMismatchTest {

    private final Problem02_SetMismatch testObject = new Problem02_SetMismatch();

    @Test
    void testFindErrorNums() {
        int[] nums = new int[]{1, 2, 2, 4};
        int[] expected = new int[]{2, 3};
        assertArrayEquals(expected, testObject.findErrorNums(nums));

        nums = new int[]{1, 1};
        expected = new int[]{1, 2};
        assertArrayEquals(expected, testObject.findErrorNums(nums));
    }
}