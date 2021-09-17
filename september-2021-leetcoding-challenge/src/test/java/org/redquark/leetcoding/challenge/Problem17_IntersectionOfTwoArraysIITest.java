package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem17_IntersectionOfTwoArraysIITest {

    private final Problem17_IntersectionOfTwoArraysII testObject = new Problem17_IntersectionOfTwoArraysII();

    @Test
    void testIntersect() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] expected = new int[]{2, 2};
        assertArrayEquals(expected, testObject.intersect(nums1, nums2));

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        expected = new int[]{4, 9};
        assertArrayEquals(expected, testObject.intersect(nums1, nums2));
    }
}