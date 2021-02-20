package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_RomanToIntegerTest {

    private final Problem20_RomanToInteger testObject = new Problem20_RomanToInteger();

    @Test
    void testRomanToInt() {
        assertEquals(3, testObject.romanToInt("III"));
        assertEquals(4, testObject.romanToInt("IV"));
        assertEquals(9, testObject.romanToInt("IX"));
        assertEquals(58, testObject.romanToInt("LVIII"));
        assertEquals(1994, testObject.romanToInt("MCMXCIV"));
    }
}