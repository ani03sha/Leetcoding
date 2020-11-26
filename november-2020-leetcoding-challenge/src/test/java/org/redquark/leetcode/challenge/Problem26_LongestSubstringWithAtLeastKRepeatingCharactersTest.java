package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_LongestSubstringWithAtLeastKRepeatingCharactersTest {

    Problem26_LongestSubstringWithAtLeastKRepeatingCharacters testObject =
            new Problem26_LongestSubstringWithAtLeastKRepeatingCharacters();

    @Test
    void testLongestSubstring() {
        assertEquals(3, testObject.longestSubstring("aaabb", 3));
        assertEquals(5, testObject.longestSubstring("ababbc", 2));
    }
}