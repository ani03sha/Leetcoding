package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_SmallestIntegerDivisibleByKTest {

    private final Problem25_SmallestIntegerDivisibleByK testObject =
            new Problem25_SmallestIntegerDivisibleByK();

    @Test
    void smallestRepunitDivByK() {
        assertEquals(1, testObject.smallestRepunitDivByK(1));
        assertEquals(-1, testObject.smallestRepunitDivByK(2));
        assertEquals(3, testObject.smallestRepunitDivByK(3));
    }
}