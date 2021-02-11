package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem11_ValidAnagramTest {

    private final Problem11_ValidAnagram testObject = new Problem11_ValidAnagram();

    @Test
    void testIsAnagram() {
        assertTrue(testObject.isAnagram("anagram", "nagaram"));
        assertFalse(testObject.isAnagram("rat", "car"));
    }
}