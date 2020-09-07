package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem07_WordPatternTest {

    private final Problem07_WordPattern testObject = new Problem07_WordPattern();

    @Test
    void testWordPattern() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        assertTrue(testObject.wordPattern(pattern, s));

        pattern = "abba";
        s = "dog cat cat fish";
        assertFalse(testObject.wordPattern(pattern, s));

        pattern = "aaaa";
        s = "dog cat cat dog";
        assertFalse(testObject.wordPattern(pattern, s));

        pattern = "abba";
        s = "dog dog dog dog";
        assertFalse(testObject.wordPattern(pattern, s));

        pattern = "aaaa";
        s = "dog dog dog dog";
        assertTrue(testObject.wordPattern(pattern, s));
    }
}