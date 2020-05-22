package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem22_SortCharactersByFrequencyTest {

    private final Problem22_SortCharactersByFrequency testObject = new Problem22_SortCharactersByFrequency();

    @Test
    void testFrequencySort() {
        assertTrue(testObject.frequencySort("tree").equals("eert")
                || testObject.frequencySort("tree").equals("eetr"));
    }
}