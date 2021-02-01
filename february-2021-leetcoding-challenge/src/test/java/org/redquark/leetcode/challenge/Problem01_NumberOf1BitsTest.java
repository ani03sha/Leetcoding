package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_NumberOf1BitsTest {

    private final Problem01_NumberOf1Bits testObject = new Problem01_NumberOf1Bits();

    @Test
    void testHammingWeight() {
        assertEquals(3, testObject.hammingWeight(521));
        assertEquals(1, testObject.hammingWeight(2097152));
        assertEquals(31, testObject.hammingWeight(-3));
    }
}