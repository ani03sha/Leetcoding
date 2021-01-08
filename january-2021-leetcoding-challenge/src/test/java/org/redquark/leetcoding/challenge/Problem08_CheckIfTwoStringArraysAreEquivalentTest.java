package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem08_CheckIfTwoStringArraysAreEquivalentTest {

    private final Problem08_CheckIfTwoStringArraysAreEquivalent testObject
            = new Problem08_CheckIfTwoStringArraysAreEquivalent();

    @Test
    void testArrayStringsAreEqual() {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        assertTrue(testObject.arrayStringsAreEqual(word1, word2));

        word1 = new String[]{"a", "cb"};
        word2 = new String[]{"ab", "c"};
        assertFalse(testObject.arrayStringsAreEqual(word1, word2));

        word1 = new String[]{"abc", "d", "defg"};
        word2 = new String[]{"abcddefg"};
        assertTrue(testObject.arrayStringsAreEqual(word1, word2));
    }
}