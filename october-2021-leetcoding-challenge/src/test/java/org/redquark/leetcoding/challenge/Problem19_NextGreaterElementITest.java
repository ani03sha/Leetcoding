package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem19_NextGreaterElementITest {

    private final Problem19_NextGreaterElementI testObject = new Problem19_NextGreaterElementI();

    @Test
    void testNextGreaterElement() {
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        int[] expected = new int[]{-1, 3, -1};
        assertArrayEquals(expected, testObject.nextGreaterElement(nums1, nums2));

        nums1 = new int[]{2, 4};
        nums2 = new int[]{1, 2, 3, 4};
        expected = new int[]{3, -1};
        assertArrayEquals(expected, testObject.nextGreaterElement(nums1, nums2));
    }
}