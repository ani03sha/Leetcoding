package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_AddDigitsTest {

    private final Problem26_AddDigits testObject = new Problem26_AddDigits();

    @Test
    void testAddDigits() {
        assertEquals(5, testObject.addDigits(41));
        assertEquals(9, testObject.addDigits(1368));
        assertEquals(2, testObject.addDigits(38));
    }
}