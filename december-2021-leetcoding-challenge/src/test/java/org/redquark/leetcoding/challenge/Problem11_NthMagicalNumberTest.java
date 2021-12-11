package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_NthMagicalNumberTest {

    private final Problem11_NthMagicalNumber testObject = new Problem11_NthMagicalNumber();

    @Test
    void testNthMagicalNumber() {
        int n = 1;
        int a = 2;
        int b = 3;
        assertEquals(2, testObject.nthMagicalNumber(n, a, b));

        n = 4;
        assertEquals(6, testObject.nthMagicalNumber(n, a, b));

        n = 5;
        b = 4;
        assertEquals(10, testObject.nthMagicalNumber(n, a, b));

        n = 3;
        a = 6;
        assertEquals(8, testObject.nthMagicalNumber(n, a, b));
    }
}