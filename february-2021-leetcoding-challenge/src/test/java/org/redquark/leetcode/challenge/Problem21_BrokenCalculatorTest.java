package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_BrokenCalculatorTest {

    private final Problem21_BrokenCalculator testObject = new Problem21_BrokenCalculator();

    @Test
    void testBrokenCalc() {
        int X = 2;
        int Y = 3;
        assertEquals(2, testObject.brokenCalc(X, Y));

        X = 5;
        Y = 8;
        assertEquals(2, testObject.brokenCalc(X, Y));

        X = 3;
        Y = 10;
        assertEquals(3, testObject.brokenCalc(X, Y));

        X = 1024;
        Y = 1;
        assertEquals(1023, testObject.brokenCalc(X, Y));
    }
}