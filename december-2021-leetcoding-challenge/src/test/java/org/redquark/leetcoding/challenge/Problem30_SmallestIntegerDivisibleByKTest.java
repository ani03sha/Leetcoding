package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_SmallestIntegerDivisibleByKTest {

    private final Problem30_SmallestIntegerDivisibleByK testObject = new Problem30_SmallestIntegerDivisibleByK();

    @Test
    void testSmallestRepunitDivByK() {
        assertEquals(1, testObject.smallestRepunitDivByK(1));
        assertEquals(-1, testObject.smallestRepunitDivByK(2));
        assertEquals(3, testObject.smallestRepunitDivByK(3));
    }
}