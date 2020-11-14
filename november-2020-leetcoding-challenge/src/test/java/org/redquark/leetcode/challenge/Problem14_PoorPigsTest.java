package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_PoorPigsTest {

    private final Problem14_PoorPigs testObject = new Problem14_PoorPigs();

    @Test
    void testPoorPigs() {
        assertEquals(5, testObject.poorPigs(1000, 15, 60));
    }
}