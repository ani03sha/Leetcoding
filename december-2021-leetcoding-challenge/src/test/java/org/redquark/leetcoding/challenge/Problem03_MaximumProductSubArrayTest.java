package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_MaximumProductSubArrayTest {

    private final Problem03_MaximumProductSubArray testObject = new Problem03_MaximumProductSubArray();

    @Test
    void testMaxProduct() {
        int[] nums = new int[]{2, 3, -2, 4};
        assertEquals(6, testObject.maxProduct(nums));

        nums = new int[]{-2, 0, -1};
        assertEquals(0, testObject.maxProduct(nums));
    }
}