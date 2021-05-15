package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem15_ValidNumberTest {

    private final Problem15_ValidNumber testObject = new Problem15_ValidNumber();

    @Test
    void testIsNumber() {
        assertTrue(testObject.isNumber("0"));
        assertFalse(testObject.isNumber("e"));
        assertFalse(testObject.isNumber("."));
        assertTrue(testObject.isNumber(".1"));
        assertTrue(testObject.isNumber("-90e+7"));
    }
}