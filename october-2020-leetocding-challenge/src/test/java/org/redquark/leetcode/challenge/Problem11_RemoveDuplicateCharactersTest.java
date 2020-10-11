package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_RemoveDuplicateCharactersTest {

    private final Problem11_RemoveDuplicateCharacters testObject =
            new Problem11_RemoveDuplicateCharacters();

    @Test
    void testRemoveDuplicateLetters() {
        assertEquals("abc", testObject.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", testObject.removeDuplicateLetters("cbacdcbc"));
        assertEquals("abc", testObject.removeDuplicateLetters("abacb"));
    }
}