package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem12_BuddyStringsTest {

    private final Problem12_BuddyStrings testObject = new Problem12_BuddyStrings();

    @Test
    void testBuddyStrings() {
        assertTrue(testObject.buddyStrings("ab", "ba"));
        assertFalse(testObject.buddyStrings("ab", "ab"));
        assertTrue(testObject.buddyStrings("aa", "aa"));
        assertTrue(testObject.buddyStrings("aaaaaaabc", "aaaaaaacb"));
        assertFalse(testObject.buddyStrings("", "aa"));
    }
}