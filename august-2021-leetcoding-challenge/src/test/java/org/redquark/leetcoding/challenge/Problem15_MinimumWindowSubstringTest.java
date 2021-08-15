package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_MinimumWindowSubstringTest {

    private final Problem15_MinimumWindowSubstring testObject = new Problem15_MinimumWindowSubstring();

    @Test
    void testMinWindow() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals("BANC", testObject.minWindow(s, t));

        s = "a";
        t = "a";
        assertEquals("a", testObject.minWindow(s, t));

        s = "a";
        t = "aa";
        assertEquals("", testObject.minWindow(s, t));
    }
}