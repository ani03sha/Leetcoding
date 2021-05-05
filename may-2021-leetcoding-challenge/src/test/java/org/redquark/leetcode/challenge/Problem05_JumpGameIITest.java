package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_JumpGameIITest {

    private final Problem05_JumpGameII testObject = new Problem05_JumpGameII();

    @Test
    void testJump() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        assertEquals(2, testObject.jump(nums));

        nums = new int[]{2, 3, 0, 1, 4};
        assertEquals(2, testObject.jump(nums));
    }
}