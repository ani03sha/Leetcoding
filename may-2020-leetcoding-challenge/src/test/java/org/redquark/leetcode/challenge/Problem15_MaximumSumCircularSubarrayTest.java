package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_MaximumSumCircularSubarrayTest {

    private final Problem15_MaximumSumCircularSubarray testObject = new Problem15_MaximumSumCircularSubarray();

    @Test
    void maxSubarraySumCircular() {
        int[] A = new int[]{1, -2, 3, -2};
        assertEquals(3, testObject.maxSubarraySumCircular(A));

        A = new int[]{5, -3, 5};
        assertEquals(10, testObject.maxSubarraySumCircular(A));

        A = new int[]{3, -1, 2, -1};
        assertEquals(4, testObject.maxSubarraySumCircular(A));

        A = new int[]{3, -2, 2, -3};
        assertEquals(3, testObject.maxSubarraySumCircular(A));

        A = new int[]{-2, -3, -1};
        assertEquals(-1, testObject.maxSubarraySumCircular(A));
    }
}