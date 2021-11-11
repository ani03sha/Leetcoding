package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_MinimumValueToGetPositiveStepByStepSumTest {

    private final Problem11_MinimumValueToGetPositiveStepByStepSum testObject = new Problem11_MinimumValueToGetPositiveStepByStepSum();

    @Test
    void testMinStartValue() {
        int[] nums = new int[]{-3, 2, -3, 4, 2};
        assertEquals(5, testObject.minStartValue(nums));

        nums = new int[]{1, 2};
        assertEquals(1, testObject.minStartValue(nums));

        nums = new int[]{1, -2, -3};
        assertEquals(5, testObject.minStartValue(nums));
    }
}