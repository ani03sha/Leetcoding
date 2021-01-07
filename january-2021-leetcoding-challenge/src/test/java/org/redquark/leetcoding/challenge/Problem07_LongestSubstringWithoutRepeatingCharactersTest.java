package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_LongestSubstringWithoutRepeatingCharactersTest {

    private final Problem07_LongestSubstringWithoutRepeatingCharacters testObject
            = new Problem07_LongestSubstringWithoutRepeatingCharacters();

    @Test
    void testLengthOfLongestSubstring() {
        assertEquals(3, testObject.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, testObject.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, testObject.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, testObject.lengthOfLongestSubstring(""));
    }
}