package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_LongestConsecutiveSequenceTest {

    private final Problem06_LongestConsecutiveSequence testObject = new Problem06_LongestConsecutiveSequence();

    @Test
    void testLongestConsecutive() {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        assertEquals(4, testObject.longestConsecutive(nums));

        nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        assertEquals(9, testObject.longestConsecutive(nums));
    }
}