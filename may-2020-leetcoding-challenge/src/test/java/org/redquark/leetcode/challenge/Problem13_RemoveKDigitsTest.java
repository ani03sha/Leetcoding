package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_RemoveKDigitsTest {

    private final Problem13_RemoveKDigits testObject = new Problem13_RemoveKDigits();

    @Test
    void testRemoveKdigits() {
        assertEquals("1219", testObject.removeKdigits("1432219", 3));
        assertEquals("200", testObject.removeKdigits("10200", 1));
        assertEquals("0", testObject.removeKdigits("10", 2));
    }
}