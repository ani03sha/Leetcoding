package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_FirstUniqueCharacterTest {

    private final Problem05_FirstUniqueCharacter testObject = new Problem05_FirstUniqueCharacter();

    @Test
    void firstUniqueCharacter() {
        assertEquals(0, testObject.firstUniqueCharacter("leetcode"));
        assertEquals(2, testObject.firstUniqueCharacter("loveleetcode"));
        assertEquals(0, testObject.optimizedFirstUniqueCharacter("leetcode"));
        assertEquals(2, testObject.optimizedFirstUniqueCharacter("loveleetcode"));
    }
}