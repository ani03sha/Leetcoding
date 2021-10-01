package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_LongestCommonSubsequenceTest {

    private final Problem01_LongestCommonSubsequence testObject = new Problem01_LongestCommonSubsequence();

    @Test
    void testLongestCommonSubsequence() {
        String text1 = "abcde";
        String text2 = "ace";
        assertEquals(3, testObject.longestCommonSubsequence(text1, text2));

        text1 = "abc";
        text2 = "abc";
        assertEquals(3, testObject.longestCommonSubsequence(text1, text2));

        text1 = "abc";
        text2 = "def";
        assertEquals(0, testObject.longestCommonSubsequence(text1, text2));
    }
}