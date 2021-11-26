package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_SearchInsertPositionTest {

    private final Problem26_SearchInsertPosition testObject = new Problem26_SearchInsertPosition();

    @Test
    void testSearchInsert() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        assertEquals(2, testObject.searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6};
        target = 2;
        assertEquals(1, testObject.searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6};
        target = 7;
        assertEquals(4, testObject.searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6};
        target = 0;
        assertEquals(0, testObject.searchInsert(nums, target));

        nums = new int[]{1};
        assertEquals(0, testObject.searchInsert(nums, target));
    }
}