package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem29_FindFirstAndLastPositionOfElementInSortedArrayTest {

    private final Problem29_FindFirstAndLastPositionOfElementInSortedArray testObject =
            new Problem29_FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    void testSearchRange() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = new int[]{3, 4};
        assertArrayEquals(expected, testObject.searchRange(nums, target));

        nums = new int[]{5, 7, 7, 8, 8, 10};
        target = 6;
        expected = new int[]{-1, -1};
        assertArrayEquals(expected, testObject.searchRange(nums, target));

        nums = new int[]{};
        target = 0;
        expected = new int[]{-1, -1};
        assertArrayEquals(expected, testObject.searchRange(nums, target));
    }
}