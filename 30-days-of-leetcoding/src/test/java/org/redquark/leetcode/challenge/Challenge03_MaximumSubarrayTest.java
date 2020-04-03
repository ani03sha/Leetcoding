package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge03_MaximumSubarrayTest {

    private Challenge03_MaximumSubarray testObject = new Challenge03_MaximumSubarray();

    @Test
    void findMaximumContiguousSum() {
        int[] numbers = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, testObject.findMaximumContiguousSum(numbers));
    }
}