package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_BasicCalculatorIITest {

    private final Problem24_BasicCalculatorII testObject = new Problem24_BasicCalculatorII();

    @Test
    void testCalculate() {
        assertEquals(7, testObject.calculate("3+2*2"));
        assertEquals(1, testObject.calculate(" 3/2 "));
        assertEquals(5, testObject.calculate(" 3+5 / 2 "));
    }
}