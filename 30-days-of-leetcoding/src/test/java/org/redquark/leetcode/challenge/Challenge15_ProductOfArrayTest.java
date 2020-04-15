package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Challenge15_ProductOfArrayTest {

    private Challenge15_ProductOfArray testObject = new Challenge15_ProductOfArray();

    @Test
    void productExceptSelf() {
        int[] numbers = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{24, 12, 8, 6};
        assertArrayEquals(expected, testObject.productExceptSelf(numbers));

        numbers = new int[]{4, 5, 1, 8, 2};
        expected = new int[]{80, 64, 320, 40, 160};
        assertArrayEquals(expected, testObject.productExceptSelf(numbers));
    }
}