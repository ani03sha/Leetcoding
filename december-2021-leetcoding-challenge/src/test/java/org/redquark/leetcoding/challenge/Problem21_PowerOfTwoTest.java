package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem21_PowerOfTwoTest {

    private final Problem21_PowerOfTwo testObject = new Problem21_PowerOfTwo();

    @Test
    void testIsPowerOfTwo() {
        assertTrue(testObject.isPowerOfTwo(1));
        assertTrue(testObject.isPowerOfTwo(16));
        assertFalse(testObject.isPowerOfTwo(12));
    }
}