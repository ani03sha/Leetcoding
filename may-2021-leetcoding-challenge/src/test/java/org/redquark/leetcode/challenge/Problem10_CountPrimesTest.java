package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_CountPrimesTest {

    private final Problem10_CountPrimes testObject = new Problem10_CountPrimes();

    @Test
    void countPrimes() {
        assertEquals(4, testObject.countPrimes(10));
        assertEquals(0, testObject.countPrimes(0));
        assertEquals(0, testObject.countPrimes(1));
    }
}