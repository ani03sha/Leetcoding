package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_NumberOfSubarraysWithBoundedMaximumTest {

    private final Problem17_NumberOfSubarraysWithBoundedMaximum testObject = new Problem17_NumberOfSubarraysWithBoundedMaximum();

    @Test
    void testNumSubarrayBoundedMax() {
        int[] nums = new int[]{2, 1, 4, 3};
        int left = 2;
        int right = 3;
        assertEquals(3, testObject.numSubarrayBoundedMax(nums, left, right));
    }
}