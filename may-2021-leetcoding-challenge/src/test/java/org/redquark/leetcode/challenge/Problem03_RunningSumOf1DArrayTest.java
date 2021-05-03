package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem03_RunningSumOf1DArrayTest {

    private final Problem03_RunningSumOf1DArray testObject = new Problem03_RunningSumOf1DArray();

    @Test
    void testRunningSum() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{1, 3, 6, 10};
        assertArrayEquals(expected, testObject.runningSum(nums));

        nums = new int[]{1, 1, 1, 1, 1};
        expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, testObject.runningSum(nums));

        nums = new int[]{3, 1, 2, 10, 1};
        expected = new int[]{3, 4, 6, 16, 17};
        assertArrayEquals(expected, testObject.runningSum(nums));
    }
}