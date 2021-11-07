package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_MultiplyStringsTest {

    private final Problem07_MultiplyStrings testObject = new Problem07_MultiplyStrings();

    @Test
    void testMultiply() {
        String num1 = "2";
        String num2 = "3";
        assertEquals("6", testObject.multiply(num1, num2));

        num1 = "123";
        num2 = "456";
        assertEquals("56088", testObject.multiply(num1, num2));
    }
}