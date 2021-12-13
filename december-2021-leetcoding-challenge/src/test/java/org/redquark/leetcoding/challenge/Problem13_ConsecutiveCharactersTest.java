package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_ConsecutiveCharactersTest {

    private final Problem13_ConsecutiveCharacters testObject = new Problem13_ConsecutiveCharacters();

    @Test
    void testMaxPower() {
        String s = "leetcode";
        assertEquals(2, testObject.maxPower(s));
    }
}