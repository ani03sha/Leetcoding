package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_ComplexNumberMultiplicationTest {

    private final Problem24_ComplexNumberMultiplication testObject = new Problem24_ComplexNumberMultiplication();

    @Test
    void testComplexNumberMultiply() {
        String num1 = "1+1i";
        String num2 = "1+1i";
        assertEquals("0+2i", testObject.complexNumberMultiply(num1, num2));

        num1 = "1+-1i";
        num2 = "1+-1i";
        assertEquals("0+-2i", testObject.complexNumberMultiply(num1, num2));
    }
}