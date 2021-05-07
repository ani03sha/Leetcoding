package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_DeleteOperationOfTwoStringsTest {

    private final Problem07_DeleteOperationOfTwoStrings testObject = new Problem07_DeleteOperationOfTwoStrings();

    @Test
    void testMinDistance() {
        String word1 = "sea";
        String word2 = "eat";
        assertEquals(2, testObject.minDistance(word1, word2));

        word1 = "leetcode";
        word2 = "etco";
        assertEquals(4, testObject.minDistance(word1, word2));

        word1 = "sea";
        word2 = "ate";
        assertEquals(4, testObject.minDistance(word1, word2));
    }
}