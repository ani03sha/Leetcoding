package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_MaximumGapTest {

    private final Problem30_MaximumGap testObject = new Problem30_MaximumGap();

    @Test
    void testMaximumGap() {
        int[] nums = new int[]{3, 6, 9, 1};
        assertEquals(3, testObject.maximumGap(nums));

        nums = new int[]{10};
        assertEquals(0, testObject.maximumGap(nums));
    }
}