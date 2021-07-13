package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_FindPeakElementTest {

    private final Problem13_FindPeakElement testObject = new Problem13_FindPeakElement();

    @Test
    void testFindPeakElement() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertEquals(2, testObject.findPeakElement(nums));

        nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        assertEquals(5, testObject.findPeakElement(nums));
    }
}