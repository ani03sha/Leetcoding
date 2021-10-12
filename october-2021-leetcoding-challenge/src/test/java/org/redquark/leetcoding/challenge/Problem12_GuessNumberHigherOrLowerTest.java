package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_GuessNumberHigherOrLowerTest {

    private final Problem12_GuessNumberHigherOrLower testObject = new Problem12_GuessNumberHigherOrLower();

    @Test
    void testGuessNumber() {
        testObject.pick = 6;
        assertEquals(6, testObject.guessNumber(10));

        testObject.pick = 1;
        assertEquals(1, testObject.guessNumber(1));

        testObject.pick = 1;
        assertEquals(1, testObject.guessNumber(2));

        testObject.pick = 2;
        assertEquals(2, testObject.guessNumber(2));
    }
}