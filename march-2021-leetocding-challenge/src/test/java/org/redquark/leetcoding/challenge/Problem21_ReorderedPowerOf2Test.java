package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem21_ReorderedPowerOf2Test {

    private final Problem21_ReorderedPowerOf2 testObject = new Problem21_ReorderedPowerOf2();

    @Test
    void testReorderedPowerOf2() {
        assertTrue(testObject.reorderedPowerOf2(1));
        assertFalse(testObject.reorderedPowerOf2(10));
        assertTrue(testObject.reorderedPowerOf2(16));
        assertFalse(testObject.reorderedPowerOf2(24));
        assertTrue(testObject.reorderedPowerOf2(46));
    }
}