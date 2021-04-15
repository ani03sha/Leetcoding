package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_FibonacciNumberTest {

    private final Problem15_FibonacciNumber testObject = new Problem15_FibonacciNumber();

    @Test
    void testFib() {
        assertEquals(1, testObject.fib(2));
        assertEquals(2, testObject.fib(3));
        assertEquals(3, testObject.fib(4));
    }
}