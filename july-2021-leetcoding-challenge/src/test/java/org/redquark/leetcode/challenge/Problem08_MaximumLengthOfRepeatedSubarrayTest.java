package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_MaximumLengthOfRepeatedSubarrayTest {

    private final Problem08_MaximumLengthOfRepeatedSubarray testObject = new Problem08_MaximumLengthOfRepeatedSubarray();

    @Test
    void testFindLength() {
        int[] nums1 = new int[]{1, 2, 3, 2, 1};
        int[] nums2 = new int[]{3, 2, 1, 4, 7};
        assertEquals(3, testObject.findLength(nums1, nums2));

        nums1 = new int[]{0, 0, 0, 0, 0};
        nums2 = new int[]{0, 0, 0, 0, 0};
        assertEquals(5, testObject.findLength(nums1, nums2));
    }
}