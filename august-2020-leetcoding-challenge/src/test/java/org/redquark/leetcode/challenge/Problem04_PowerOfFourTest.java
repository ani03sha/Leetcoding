package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem04_PowerOfFourTest {

    private final Problem04_PowerOfFour testObject = new Problem04_PowerOfFour();

    @Test
    void testIsPowerOfFour() {
        assertTrue(testObject.isPowerOfFour(4096));
        assertFalse(testObject.isPowerOfFour(2048));
    }
}