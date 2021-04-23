package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_CountBinarySubstringsTest {

    private final Problem23_CountBinarySubstrings testObject = new Problem23_CountBinarySubstrings();

    @Test
    void testCountBinarySubstrings() {
        assertEquals(6, testObject.countBinarySubstrings("00110011"));
        assertEquals(4, testObject.countBinarySubstrings("10101"));
    }
}