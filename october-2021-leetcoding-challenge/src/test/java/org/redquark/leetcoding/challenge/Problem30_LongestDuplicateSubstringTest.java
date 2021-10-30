package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_LongestDuplicateSubstringTest {

    private final Problem30_LongestDuplicateSubstring testObject = new Problem30_LongestDuplicateSubstring();

    @Test
    void testLongestDupSubstring() {
        String s = "banana";
        assertEquals("ana", testObject.longestDupSubstring(s));

        s = "abcd";
        assertEquals("", testObject.longestDupSubstring(s));
    }
}