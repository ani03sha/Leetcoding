package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_FindTheSmallestDivisorGivenAThresholdTest {

    private final Problem06_FindTheSmallestDivisorGivenAThreshold testObject =
            new Problem06_FindTheSmallestDivisorGivenAThreshold();

    @Test
    void testSmallestDivisor() {
        int[] nums = new int[]{1, 2, 5, 9};
        int threshold = 6;
        assertEquals(5, testObject.smallestDivisor(nums, threshold));

        nums = new int[]{2, 3, 5, 7, 11};
        threshold = 11;
        assertEquals(3, testObject.smallestDivisor(nums, threshold));

        nums = new int[]{19};
        threshold = 5;
        assertEquals(4, testObject.smallestDivisor(nums, threshold));
    }
}