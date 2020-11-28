package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem28_SlidingWindowMaximumTest {

    private final Problem28_SlidingWindowMaximum testObject = new Problem28_SlidingWindowMaximum();

    @Test
    void testMxSlidingWindow() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] expected = new int[]{3, 3, 5, 5, 6, 7};
        assertArrayEquals(expected, testObject.maxSlidingWindow(nums, k));

        nums = new int[]{1};
        k = 1;
        expected = new int[]{1};
        assertArrayEquals(expected, testObject.maxSlidingWindow(nums, k));

        nums = new int[]{1, -1};
        k = 1;
        expected = new int[]{1, -1};
        assertArrayEquals(expected, testObject.maxSlidingWindow(nums, k));

        nums = new int[]{9, 11};
        k = 2;
        expected = new int[]{11};
        assertArrayEquals(expected, testObject.maxSlidingWindow(nums, k));

        nums = new int[]{4, -2};
        k = 2;
        expected = new int[]{4};
        assertArrayEquals(expected, testObject.maxSlidingWindow(nums, k));
    }
}