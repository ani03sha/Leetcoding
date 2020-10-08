package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_BinarySearchTest {

    Problem08_BinarySearch testObject = new Problem08_BinarySearch();

    @Test
    void testSearch() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        assertEquals(4, testObject.search(nums, target));

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 2;
        assertEquals(-1, testObject.search(nums, target));
    }
}