package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem08_PowerOfTwoTest {

    private final Problem08_PowerOfTwo testObject = new Problem08_PowerOfTwo();

    @Test
    void testIsPowerOfTwo() {
        assertTrue(testObject.isPowerOfTwo(64));
        assertTrue(testObject.isPowerOfTwo(1048576));
        assertFalse(testObject.isPowerOfTwo(48));
        assertTrue(testObject.isPowerOfTwo(1));
        assertTrue(testObject.isPowerOfTwo(536870912));
        assertFalse(testObject.isPowerOfTwo(31));
    }
}