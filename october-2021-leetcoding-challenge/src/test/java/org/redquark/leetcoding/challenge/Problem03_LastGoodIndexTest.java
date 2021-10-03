package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem03_LastGoodIndexTest {

    private final Problem03_LastGoodIndex testObject = new Problem03_LastGoodIndex();

    @Test
    void testCanJump() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        assertTrue(testObject.canJump(nums));

        nums = new int[]{3, 2, 1, 0, 4};
        assertFalse(testObject.canJump(nums));
    }
}