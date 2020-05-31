package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem31_EditDistanceTest {

    private final Problem31_EditDistance testObject = new Problem31_EditDistance();

    @Test
    void testMinDistance() {
        String word1 = "horse";
        String word2 = "ros";
        assertEquals(3, testObject.minDistance(word1, word2));

        word1 = "intention";
        word2 = "execution";
        assertEquals(5, testObject.minDistance(word1, word2));
    }
}