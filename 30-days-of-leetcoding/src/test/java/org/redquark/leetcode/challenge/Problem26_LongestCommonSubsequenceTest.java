package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_LongestCommonSubsequenceTest {

    private final Problem26_LongestCommonSubsequence testObject = new Problem26_LongestCommonSubsequence();

    @Test
    void longestCommonSubsequence() {
        String s1 = "abcde";
        String s2 = "ace";
        assertEquals(3, testObject.longestCommonSubsequence(s1, s2));

        s1 = "abc";
        s2 = "abc";
        assertEquals(3, testObject.longestCommonSubsequence(s1, s2));

        s1 = "abc";
        s2 = "def";
        assertEquals(0, testObject.longestCommonSubsequence(s1, s2));

        s1 = "";
        s2 = "";
        assertEquals(0, testObject.longestCommonSubsequence(s1, s2));
    }
}