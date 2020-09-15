package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_LengthOfLastWordTest {

    private final Problem15_LengthOfLastWord testObject = new Problem15_LengthOfLastWord();

    @Test
    void testLengthOfLastWord() {
        assertEquals(5, testObject.lengthOfLastWord("Hello World"));
        assertEquals(0, testObject.lengthOfLastWord(" "));
        assertEquals(0, testObject.lengthOfLastWord(""));
        assertEquals(7, testObject.lengthOfLastWord("Anirudh"));
    }
}