package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem03_RansomNoteTest {

    private final Problem03_RansomNote testObject = new Problem03_RansomNote();

    @Test
    void testCanConstruct() {
        String ransomNote = "a";
        String magazine = "b";
        assertFalse(testObject.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "ab";
        assertFalse(testObject.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "aab";
        assertTrue(testObject.canConstruct(ransomNote, magazine));
    }
}