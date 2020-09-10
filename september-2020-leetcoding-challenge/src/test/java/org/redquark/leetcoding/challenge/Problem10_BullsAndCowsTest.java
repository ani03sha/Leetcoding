package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_BullsAndCowsTest {

    private final Problem10_BullsAndCows testObject = new Problem10_BullsAndCows();

    @Test
    void testGetHint() {
        String secret = "1807";
        String guess = "7810";
        assertEquals("1A3B", testObject.getHint(secret, guess));

        secret = "1123";
        guess = "0111";
        assertEquals("1A1B", testObject.getHint(secret, guess));
    }
}