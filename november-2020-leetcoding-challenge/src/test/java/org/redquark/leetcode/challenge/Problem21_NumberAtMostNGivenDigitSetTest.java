package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_NumberAtMostNGivenDigitSetTest {

    private final Problem21_NumberAtMostNGivenDigitSet testObject =
            new Problem21_NumberAtMostNGivenDigitSet();

    @Test
    void testAtMostNGivenDigitSet() {
        assertEquals(20, testObject.atMostNGivenDigitSet(new String[]{"1", "3", "5", "7"}, 100));
        assertEquals(29523, testObject.atMostNGivenDigitSet(new String[]{"1", "4", "9"}, 1000000000));
        assertEquals(1, testObject.atMostNGivenDigitSet(new String[]{"7"}, 8));
    }
}