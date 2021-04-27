package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem27_PowerOfThreeTest {

    private final Problem27_PowerOfThree testObject = new Problem27_PowerOfThree();

    @Test
    void testIsPowerOfThree() {
        assertTrue(testObject.isPowerOfThree(27));
        assertFalse(testObject.isPowerOfThree(0));
        assertTrue(testObject.isPowerOfThree(9));
        assertFalse(testObject.isPowerOfThree(45));
    }
}