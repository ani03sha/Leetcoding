package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_UniqueMorseCodeWordsTest {

    private final Problem22_UniqueMorseCodeWords testObject = new Problem22_UniqueMorseCodeWords();

    @Test
    void testUniqueMorseRepresentations() {
        String[] words = {"gin", "zen", "gig", "msg"};
        assertEquals(2, testObject.uniqueMorseRepresentations(words));
    }
}