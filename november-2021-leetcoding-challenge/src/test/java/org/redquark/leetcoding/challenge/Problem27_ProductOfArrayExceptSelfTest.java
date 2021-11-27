package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem27_ProductOfArrayExceptSelfTest {

    private final Problem27_ProductOfArrayExceptSelf testObject = new Problem27_ProductOfArrayExceptSelf();

    @Test
    void testProductExceptSelf() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{24, 12, 8, 6};
        assertArrayEquals(expected, testObject.productExceptSelf(nums));

        nums = new int[]{-1, 1, 0, -3, 3};
        expected = new int[]{0, 0, 9, 0, 0};
        assertArrayEquals(expected, testObject.productExceptSelf(nums));
    }
}