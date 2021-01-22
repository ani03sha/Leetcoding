package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem22_DetermineIfTwoStringsAreCloseTest {

    private final Problem22_DetermineIfTwoStringsAreClose testObject =
            new Problem22_DetermineIfTwoStringsAreClose();

    @Test
    void testCloseStrings() {
        String word1 = "abc";
        String word2 = "bca";
        assertTrue(testObject.closeStrings(word1, word2));

        word1 = "a";
        word2 = "aa";
        assertFalse(testObject.closeStrings(word1, word2));

        word1 = "cabbba";
        word2 = "abbccc";
        assertTrue(testObject.closeStrings(word1, word2));

        word1 = "cabbba";
        word2 = "aabbss";
        assertFalse(testObject.closeStrings(word1, word2));
    }
}