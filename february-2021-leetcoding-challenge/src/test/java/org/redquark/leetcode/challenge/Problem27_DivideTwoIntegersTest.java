package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_DivideTwoIntegersTest {

    private final Problem27_DivideTwoIntegers testObject = new Problem27_DivideTwoIntegers();

    @Test
    void testDivide() {
        int dividend = 10;
        int divisor = 3;
        assertEquals(3, testObject.divide(dividend, divisor));

        dividend = 7;
        divisor = -3;
        assertEquals(-2, testObject.divide(dividend, divisor));

        dividend = 0;
        divisor = 1;
        assertEquals(0, testObject.divide(dividend, divisor));

        dividend = 1;
        divisor = 1;
        assertEquals(1, testObject.divide(dividend, divisor));

        dividend = Integer.MIN_VALUE;
        divisor = 2;
        assertEquals(Integer.MIN_VALUE / 2, testObject.divide(dividend, divisor));
    }
}