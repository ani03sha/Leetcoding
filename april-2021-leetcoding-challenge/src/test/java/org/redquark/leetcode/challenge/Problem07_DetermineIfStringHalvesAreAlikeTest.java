package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem07_DetermineIfStringHalvesAreAlikeTest {

    private final Problem07_DetermineIfStringHalvesAreAlike testObject =
            new Problem07_DetermineIfStringHalvesAreAlike();

    @Test
    void testHalvesAreAlike() {
        assertTrue(testObject.halvesAreAlike("book"));
        assertFalse(testObject.halvesAreAlike("textbook"));
        assertFalse(testObject.halvesAreAlike("MerryChristmas"));
        assertTrue(testObject.halvesAreAlike("AbCdEfGh"));
    }
}