package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_BasicCalculatorTest {

    private final Problem11_BasicCalculator testObject = new Problem11_BasicCalculator();

    @Test
    void testCalculate() {
        String s = "1 + 1";
        assertEquals(2, testObject.calculate(s));

        s = " 2-1 + 2 ";
        assertEquals(3, testObject.calculate(s));

        s = "(1+(4+5+2)-3)+(6+8)";
        assertEquals(23, testObject.calculate(s));
    }
}