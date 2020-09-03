package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem03_RepeatedSubstringPatternTest {

    private final Problem03_RepeatedSubstringPattern testObject = new Problem03_RepeatedSubstringPattern();

    @Test
    void testRepeatedSubstringPattern() {
        assertTrue(testObject.repeatedSubstringPattern("abab"));
        assertFalse(testObject.repeatedSubstringPattern("aba"));
        assertTrue(testObject.repeatedSubstringPattern("abcabcabcabc"));
    }
}