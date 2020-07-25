package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_MinimumInRotatedSortedArrayIITest {

    private final Problem25_MinimumInRotatedSortedArrayII testObject = new Problem25_MinimumInRotatedSortedArrayII();

    @Test
    void testFindMin() {
        int[] numbers = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        assertEquals(0, testObject.findMin(numbers));
        numbers = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(1, testObject.findMin(numbers));
    }
}