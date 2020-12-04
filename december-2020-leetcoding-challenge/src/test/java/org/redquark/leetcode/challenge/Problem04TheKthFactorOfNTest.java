package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_TheKthFactorOfNTest {

    private final Problem04_TheKthFactorOfN testObject = new Problem04_TheKthFactorOfN();

    @Test
    void testKthFactor() {
        assertEquals(3, testObject.kthFactor(12, 3));
        assertEquals(7, testObject.kthFactor(7, 2));
        assertEquals(-1, testObject.kthFactor(4, 4));
        assertEquals(1, testObject.kthFactor(1, 1));
        assertEquals(4, testObject.kthFactor(100, 3));
    }
}