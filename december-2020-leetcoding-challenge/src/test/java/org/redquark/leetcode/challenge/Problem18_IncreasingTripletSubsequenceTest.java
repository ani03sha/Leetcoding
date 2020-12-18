package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem18_IncreasingTripletSubsequenceTest {

    private final Problem18_IncreasingTripletSubsequence testObject =
            new Problem18_IncreasingTripletSubsequence();

    @Test
    void testIncreasingTriplet() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        assertTrue(testObject.increasingTriplet(nums));

        nums = new int[]{5, 4, 3, 2, 1};
        assertFalse(testObject.increasingTriplet(nums));

        nums = new int[]{2, 1, 5, 0, 4, 6};
        assertTrue(testObject.increasingTriplet(nums));
    }
}