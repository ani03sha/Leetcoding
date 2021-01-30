package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_MinimizeDeviationInArrayTest {

    private final Problem30_MinimizeDeviationInArray testObject = new Problem30_MinimizeDeviationInArray();

    @Test
    void testMinimumDeviation() {
        int[] nums = new int[]{1, 2, 3, 4};
        assertEquals(1, testObject.minimumDeviation(nums));

        nums = new int[]{4, 1, 5, 20, 3};
        assertEquals(3, testObject.minimumDeviation(nums));

        nums = new int[]{2, 10, 8};
        assertEquals(3, testObject.minimumDeviation(nums));
    }
}