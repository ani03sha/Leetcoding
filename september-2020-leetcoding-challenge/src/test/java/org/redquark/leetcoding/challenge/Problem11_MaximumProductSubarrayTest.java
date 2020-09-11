package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_MaximumProductSubarrayTest {

    Problem11_MaximumProductSubarray testObject = new Problem11_MaximumProductSubarray();

    @Test
    void testMxProduct() {
        int[] numbers = new int[]{2, 3, -2, 4};
        assertEquals(6, testObject.maxProduct(numbers));

        numbers = new int[]{-2, 0, -1};
        assertEquals(0, testObject.maxProduct(numbers));
    }
}