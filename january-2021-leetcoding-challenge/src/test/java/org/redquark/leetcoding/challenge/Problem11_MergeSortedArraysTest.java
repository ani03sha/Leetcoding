package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem11_MergeSortedArraysTest {

    private final Problem11_MergeSortedArrays testObject = new Problem11_MergeSortedArrays();

    @Test
    void testMerge() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, testObject.merge(nums1, m, nums2, n));

        nums1 = new int[]{1};
        m = 1;
        nums2 = new int[]{};
        n = 0;
        expected = new int[]{1};
        assertArrayEquals(expected, testObject.merge(nums1, m, nums2, n));
    }
}