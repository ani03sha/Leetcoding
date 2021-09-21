package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_MaxConsecutiveOnesTest {

    private final Problem21_MaxConsecutiveOnes testObject = new Problem21_MaxConsecutiveOnes();

    @Test
    void testFindMaxConsecutiveOnes() {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        assertEquals(3, testObject.findMaxConsecutiveOnes(nums));

        nums = new int[]{1, 0, 1, 1, 0, 1};
        assertEquals(2, testObject.findMaxConsecutiveOnes(nums));
    }
}