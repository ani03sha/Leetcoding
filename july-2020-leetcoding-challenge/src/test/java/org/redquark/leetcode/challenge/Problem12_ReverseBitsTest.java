package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_ReverseBitsTest {

    private final Problem12_ReverseBits testObject = new Problem12_ReverseBits();

    @Test
    void testReverseBits() {
        assertEquals(964176192, testObject.reverseBits(43261596));
        assertEquals(-1073741825, testObject.reverseBits(-3));
    }
}