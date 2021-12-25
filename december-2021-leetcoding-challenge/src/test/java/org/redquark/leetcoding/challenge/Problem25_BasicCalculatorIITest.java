package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_BasicCalculatorIITest {

    private final Problem25_BasicCalculatorII testObject = new Problem25_BasicCalculatorII();

    @Test
    void testCalculate() {
        String s = "3+2*2";
        assertEquals(7, testObject.calculate(s));

        s = " 3/2 ";
        assertEquals(1, testObject.calculate(s));

        s = " 3+5 / 2 ";
        assertEquals(5, testObject.calculate(s));
    }
}