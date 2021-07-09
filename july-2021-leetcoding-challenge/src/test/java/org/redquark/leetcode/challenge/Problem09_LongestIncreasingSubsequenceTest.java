package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_LongestIncreasingSubsequenceTest {

    private final Problem09_LongestIncreasingSubsequence testObject = new Problem09_LongestIncreasingSubsequence();

    @Test
    void lengthOfLIS() {
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, testObject.lengthOfLIS(nums));

        nums = new int[]{0, 1, 0, 3, 2, 3};
        assertEquals(4, testObject.lengthOfLIS(nums));

        nums = new int[]{7, 7, 7, 7, 7, 7, 7};
        assertEquals(1, testObject.lengthOfLIS(nums));
    }
}