package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_GetMaximumInGeneratedArrayTest {

    private final Problem15_GetMaximumInGeneratedArray testObject =
            new Problem15_GetMaximumInGeneratedArray();

    @Test
    void testGetMaximumGenerated() {
        assertEquals(1, testObject.getMaximumGenerated(2));
        assertEquals(2, testObject.getMaximumGenerated(3));
    }
}