package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_NumberOfMatchingSubsequencesTest {

    private final Problem22_NumberOfMatchingSubsequences testObject = new Problem22_NumberOfMatchingSubsequences();

    @Test
    void testNumMatchingSubsequences() {
        String s = "abcde";
        String[] words = new String[]{"a", "bb", "acd", "ace"};
        assertEquals(3, testObject.numMatchingSubsequences(s, words));

        s = "dsahjpjauf";
        words = new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};
        assertEquals(2, testObject.numMatchingSubsequences(s, words));
    }
}