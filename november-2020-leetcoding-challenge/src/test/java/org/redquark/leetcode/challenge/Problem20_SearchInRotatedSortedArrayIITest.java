package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem20_SearchInRotatedSortedArrayIITest {

    private final Problem20_SearchInRotatedSortedArrayII testObject =
            new Problem20_SearchInRotatedSortedArrayII();

    @Test
    void testSearch() {
        int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        assertTrue(testObject.search(nums, target));

        nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        target = 3;
        assertFalse(testObject.search(nums, target));
    }
}