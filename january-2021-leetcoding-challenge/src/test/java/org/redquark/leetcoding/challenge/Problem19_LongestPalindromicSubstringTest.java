package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_LongestPalindromicSubstringTest {

    private final Problem19_LongestPalindromicSubstring testObject =
            new Problem19_LongestPalindromicSubstring();

    @Test
    void testLongestPalindrome() {
        assertEquals("bab", testObject.longestPalindrome("babad"));
        assertEquals("bb", testObject.longestPalindrome("cbbd"));
        assertEquals("a", testObject.longestPalindrome("a"));
        assertEquals("a", testObject.longestPalindrome("ac"));
    }
}