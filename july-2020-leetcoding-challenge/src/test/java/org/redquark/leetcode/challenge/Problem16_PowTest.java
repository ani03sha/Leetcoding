package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_PowTest {

    private final Problem16_Pow testObject = new Problem16_Pow();

    @Test
    void testCalculate() {
        double x = 2.000;
        int n = -5;
        assertEquals(0.03125, testObject.calculate(x, n));

        x = -4;
        n = -3;
        assertEquals(-0.015625, testObject.calculate(x, n));
    }
}