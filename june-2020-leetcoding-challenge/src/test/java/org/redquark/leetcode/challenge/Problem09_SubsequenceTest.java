package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem09_SubsequenceTest {

    private final Problem09_Subsequence testObject = new Problem09_Subsequence();

    @Test
    void testIsSubsequence() {
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(testObject.isSubsequence(s, t));

        s = "axc";
        t = "ahbgdc";
        assertFalse(testObject.isSubsequence(s, t));
    }
}