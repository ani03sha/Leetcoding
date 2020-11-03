package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_ConsecutiveCharactersTest {

    private final Problem03_ConsecutiveCharacters testObject = new Problem03_ConsecutiveCharacters();

    @Test
    void testMaxPower() {
        assertEquals(2, testObject.maxPower("leetcode"));
        assertEquals(5, testObject.maxPower("abbcccddddeeeeedcba"));
        assertEquals(5, testObject.maxPower("triplepillooooow"));
        assertEquals(11, testObject.maxPower("hooraaaaaaaaaaay"));
        assertEquals(1, testObject.maxPower("tourist"));
    }
}