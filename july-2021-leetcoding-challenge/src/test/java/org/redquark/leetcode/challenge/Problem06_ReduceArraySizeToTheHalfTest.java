package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_ReduceArraySizeToTheHalfTest {

    private final Problem06_ReduceArraySizeToTheHalf testObject = new Problem06_ReduceArraySizeToTheHalf();

    @Test
    void testMinSetSize() {
        int[] nums = new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        assertEquals(2, testObject.minSetSize(nums));

        nums = new int[]{7, 7, 7, 7, 7, 7};
        assertEquals(1, testObject.minSetSize(nums));

        nums = new int[]{1, 9};
        assertEquals(1, testObject.minSetSize(nums));

        nums = new int[]{1000, 1000, 3, 7};
        assertEquals(1, testObject.minSetSize(nums));

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(5, testObject.minSetSize(nums));
    }
}