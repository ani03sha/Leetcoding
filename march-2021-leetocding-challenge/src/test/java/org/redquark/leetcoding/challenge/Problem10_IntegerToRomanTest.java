package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_IntegerToRomanTest {

    private final Problem10_IntegerToRoman testObject = new Problem10_IntegerToRoman();

    @Test
    void testIntToRoman() {
        assertEquals("III", testObject.intToRoman(3));
        assertEquals("IV", testObject.intToRoman(4));
        assertEquals("IX", testObject.intToRoman(9));
        assertEquals("LVIII", testObject.intToRoman(58));
        assertEquals("MCMXCIV", testObject.intToRoman(1994));
    }
}