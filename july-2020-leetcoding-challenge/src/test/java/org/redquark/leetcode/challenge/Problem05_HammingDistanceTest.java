package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_HammingDistanceTest {

    private final Problem05_HammingDistance testObject = new Problem05_HammingDistance();

    @Test
    void testHammingDistance() {
        assertEquals(2, testObject.hammingDistance(1, 4));
        assertEquals(2, testObject.hammingDistance(3, 6));
        assertEquals(3, testObject.hammingDistance(3, 64));
        assertEquals(15, testObject.hammingDistance(567962464, 21454));
    }
}