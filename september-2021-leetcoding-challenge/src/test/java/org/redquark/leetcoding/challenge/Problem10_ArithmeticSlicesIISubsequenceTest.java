package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem10_ArithmeticSlicesIISubsequenceTest {

    private final Problem10_ArithmeticSlicesIISubsequence testObject = new Problem10_ArithmeticSlicesIISubsequence();

    @Test
    void testNumberOfArithmeticSlices() {
        int[] nums = new int[]{2, 4, 6, 8, 10};
        assertEquals(7, testObject.numberOfArithmeticSlices(nums));

        nums = new int[]{7, 7, 7, 7, 7};
        assertEquals(16, testObject.numberOfArithmeticSlices(nums));
    }
}