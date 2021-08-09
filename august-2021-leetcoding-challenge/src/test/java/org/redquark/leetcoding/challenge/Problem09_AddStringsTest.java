package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_AddStringsTest {

    private final Problem09_AddStrings testObject = new Problem09_AddStrings();

    @Test
    void addStrings() {
        String num1 = "11";
        String num2 = "123";
        assertEquals("134", testObject.addStrings(num1, num2));

        num1 = "456";
        num2 = "77";
        assertEquals("533", testObject.addStrings(num1, num2));

        num1 = "0";
        num2 = "0";
        assertEquals("0", testObject.addStrings(num1, num2));
    }
}