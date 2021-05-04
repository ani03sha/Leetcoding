package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem04_NonDecreasingArrayTest {

    private final Problem04_NonDecreasingArray testObject = new Problem04_NonDecreasingArray();

    @Test
    void testCheckPossibility() {
        int[] nums = new int[]{4, 2, 3};
        assertTrue(testObject.checkPossibility(nums));

        nums = new int[]{4, 2, 1};
        assertFalse(testObject.checkPossibility(nums));
    }
}