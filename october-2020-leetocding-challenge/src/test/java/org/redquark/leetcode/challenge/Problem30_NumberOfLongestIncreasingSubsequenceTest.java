package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_NumberOfLongestIncreasingSubsequenceTest {

    private final Problem30_NumberOfLongestIncreasingSubsequence testObject =
            new Problem30_NumberOfLongestIncreasingSubsequence();

    @Test
    void testFindNumberOfLIS() {
        int[] nums = new int[]{1, 3, 5, 4, 7};
        assertEquals(2, testObject.findNumberOfLIS(nums));

        nums = new int[]{2, 2, 2, 2, 2};
        assertEquals(5, testObject.findNumberOfLIS(nums));
    }
}