package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_LongestHarmoniousSubsequenceTest {

    private final Problem04_LongestHarmoniousSubsequence testObject = new Problem04_LongestHarmoniousSubsequence();

    @Test
    void testFindLHS() {
        int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        assertEquals(5, testObject.findLHS(nums));

        nums = new int[]{1, 2, 3, 4};
        assertEquals(2, testObject.findLHS(nums));

        nums = new int[]{1, 1, 1, 1};
        assertEquals(0, testObject.findLHS(nums));
    }
}