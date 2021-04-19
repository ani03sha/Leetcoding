package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_CombinationSumIVTest {

    private final Problem19_CombinationSumIV testObject = new Problem19_CombinationSumIV();

    @Test
    void testCombinationSum4() {
        int[] nums = new int[]{1, 2, 3};
        int target = 4;
        assertEquals(7, testObject.combinationSum4(nums, target));

        nums = new int[]{9};
        target = 3;
        assertEquals(0, testObject.combinationSum4(nums, target));
    }
}