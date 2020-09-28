package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_MaximumSubarrayProductLessThanKTest {

    private final Problem28_MaximumSubarrayProductLessThanK testObject =
            new Problem28_MaximumSubarrayProductLessThanK();

    @Test
    void testNumSubarrayProductLessThanK() {
        int[] numbers = {10, 5, 2, 6};
        int k = 100;
        assertEquals(8, testObject.numSubarrayProductLessThanK(numbers, k));
    }
}