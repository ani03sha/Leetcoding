package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Challenge25_JumpGameTest {

    private final Challenge25_JumpGame testObject = new Challenge25_JumpGame();

    @Test
    void canJump() {
        int[] numbers = new int[]{2, 3, 1, 1, 4};
        assertTrue(testObject.canJump(numbers));

        numbers = new int[]{3, 2, 1, 0, 4};
        assertFalse(testObject.canJump(numbers));
    }
}