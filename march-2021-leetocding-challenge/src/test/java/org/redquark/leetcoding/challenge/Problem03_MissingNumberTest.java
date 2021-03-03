package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_MissingNumberTest {

    private final Problem03_MissingNumber testObject = new Problem03_MissingNumber();

    @Test
    void testMissingNumber() {
        int[] nums = new int[]{3, 0, 1};
        assertEquals(2, testObject.missingNumber(nums));

        nums = new int[]{0, 1};
        assertEquals(2, testObject.missingNumber(nums));

        nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, testObject.missingNumber(nums));

        nums = new int[]{0};
        assertEquals(1, testObject.missingNumber(nums));
    }
}