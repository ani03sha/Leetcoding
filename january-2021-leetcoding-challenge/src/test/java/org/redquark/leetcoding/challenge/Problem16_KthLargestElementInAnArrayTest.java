package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_KthLargestElementInAnArrayTest {

    private final Problem16_KthLargestElementInAnArray testObject =
            new Problem16_KthLargestElementInAnArray();

    @Test
    void testFindKthLargest() {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        assertEquals(5, testObject.findKthLargest(nums, k));

        nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        k = 4;
        assertEquals(4, testObject.findKthLargest(nums, k));
    }
}