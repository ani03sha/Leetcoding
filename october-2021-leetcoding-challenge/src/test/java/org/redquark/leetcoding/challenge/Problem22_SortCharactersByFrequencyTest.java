package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_SortCharactersByFrequencyTest {

    private final Problem22_SortCharactersByFrequency testObject = new Problem22_SortCharactersByFrequency();

    @Test
    void testFrequencySort() {
        assertEquals("eert", testObject.frequencySort("tree"));
        assertEquals("cccaaa", "cccaaa");
        assertEquals("bbAa", testObject.frequencySort("Aabb"));
    }
}