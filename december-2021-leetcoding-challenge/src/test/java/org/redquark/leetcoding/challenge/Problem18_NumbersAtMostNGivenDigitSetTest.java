package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_NumbersAtMostNGivenDigitSetTest {

    private final Problem18_NumbersAtMostNGivenDigitSet testObject = new Problem18_NumbersAtMostNGivenDigitSet();

    @Test
    void testAtMostNGivenDigitSet() {
        String[] digits = new String[]{"1", "3", "5", "7"};
        int n = 100;
        assertEquals(20, testObject.atMostNGivenDigitSet(digits, n));

        digits = new String[]{"1", "4", "9"};
        n = 1000000000;
        assertEquals(29523, testObject.atMostNGivenDigitSet(digits, n));

        digits = new String[]{"7"};
        n = 8;
        assertEquals(1, testObject.atMostNGivenDigitSet(digits, n));
    }
}