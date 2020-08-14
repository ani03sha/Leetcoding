package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_LongestPalindromeTest {

    private final Problem14_LongestPalindrome testObject = new Problem14_LongestPalindrome();

    @Test
    void testLongestPalindrome() {
        assertEquals(7, testObject.longestPalindrome("abccccdd"));
    }
}