package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_NonNegativeIntegersWithoutConsecutiveOnesTest {

    private final Problem25_NonNegativeIntegersWithoutConsecutiveOnes testObject =
            new Problem25_NonNegativeIntegersWithoutConsecutiveOnes();

    @Test
    void testFindIntegers() {
        assertEquals(5, testObject.findIntegers(5));
        assertEquals(2, testObject.findIntegers(1));
        assertEquals(3, testObject.findIntegers(2));
    }
}