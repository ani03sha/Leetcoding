package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_NthTribonacciNumberTest {

    private final Problem24_NthTribonacciNumber testObject = new Problem24_NthTribonacciNumber();

    @Test
    void testTribonacci() {
        assertEquals(4, testObject.tribonacci(4));
        assertEquals(1389537, testObject.tribonacci(25));
    }
}