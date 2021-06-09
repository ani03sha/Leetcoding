package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_JumpGameVITest {

    private final Problem09_JumpGameVI testObject = new Problem09_JumpGameVI();

    @Test
    void testMaxResult() {
        int[] nums = new int[]{1, -1, -2, 4, -7, 3};
        int k = 2;
        assertEquals(7, testObject.maxResult(nums, k));

        nums = new int[]{10, -5, -2, 4, 0, 3};
        k = 3;
        assertEquals(17, testObject.maxResult(nums, k));

        nums = new int[]{1, -5, -20, 4, -1, 3, -6, -3};
        k = 2;
        assertEquals(0, testObject.maxResult(nums, k));
    }
}