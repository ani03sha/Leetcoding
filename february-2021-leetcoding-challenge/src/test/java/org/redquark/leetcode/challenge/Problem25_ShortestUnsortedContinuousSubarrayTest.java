package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_ShortestUnsortedContinuousSubarrayTest {

    private final Problem25_ShortestUnsortedContinuousSubarray testObject =
            new Problem25_ShortestUnsortedContinuousSubarray();

    @Test
    void testFindUnsortedSubarray() {
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        assertEquals(5, testObject.findUnsortedSubarray(nums));

        nums = new int[]{1, 2, 3, 4};
        assertEquals(0, testObject.findUnsortedSubarray(nums));

        nums = new int[]{1};
        assertEquals(0, testObject.findUnsortedSubarray(nums));
    }
}