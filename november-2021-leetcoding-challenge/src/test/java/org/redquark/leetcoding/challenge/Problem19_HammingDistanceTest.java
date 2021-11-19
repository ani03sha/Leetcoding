package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_HammingDistanceTest {

    private final Problem19_HammingDistance testObject = new Problem19_HammingDistance();

    @Test
    void hammingDistance() {
        assertEquals(2, testObject.hammingDistance(1, 4));
        assertEquals(1, testObject.hammingDistance(1, 3));
    }
}