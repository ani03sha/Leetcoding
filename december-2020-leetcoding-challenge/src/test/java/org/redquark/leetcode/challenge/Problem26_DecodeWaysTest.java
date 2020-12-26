package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_DecodeWaysTest {

    private final Problem26_DecodeWays testObject = new Problem26_DecodeWays();

    @Test
    void testNumDecodings() {
        assertEquals(2, testObject.numDecodings("12"));
        assertEquals(3, testObject.numDecodings("226"));
        assertEquals(0, testObject.numDecodings("0"));
        assertEquals(1, testObject.numDecodings("1"));
    }
}