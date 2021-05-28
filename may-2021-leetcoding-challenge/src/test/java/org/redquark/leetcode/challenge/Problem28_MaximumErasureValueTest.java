package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_MaximumErasureValueTest {

    private final Problem28_MaximumErasureValue testObject = new Problem28_MaximumErasureValue();

    @Test
    void testMaximumUniqueSubarray() {
        int[] nums = new int[]{4, 2, 4, 5, 6};
        assertEquals(17, testObject.maximumUniqueSubarray(nums));

        nums = new int[]{5, 2, 1, 2, 5, 2, 1, 2, 5};
        assertEquals(8, testObject.maximumUniqueSubarray(nums));
    }
}