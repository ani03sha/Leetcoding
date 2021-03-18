package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_WiggleSubsequenceTest {

    private final Problem18_WiggleSubsequence testObject = new Problem18_WiggleSubsequence();

    @Test
    void testWiggleMaxLength() {
        int[] nums = new int[]{1, 7, 4, 9, 2, 5};
        assertEquals(6, testObject.wiggleMaxLength(nums));

        nums = new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        assertEquals(7, testObject.wiggleMaxLength(nums));

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(2, testObject.wiggleMaxLength(nums));
    }
}