package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_FindMinimumInRotatedSortedArrayIITest {

    private final Problem23_FindMinimumInRotatedSortedArrayII testObject = new Problem23_FindMinimumInRotatedSortedArrayII();

    @Test
    void testFindMin() {
        int[] nums = new int[]{1, 3, 5};
        assertEquals(1, testObject.findMin(nums));

        nums = new int[]{2, 2, 2, 0, 1};
        assertEquals(0, testObject.findMin(nums));
    }
}