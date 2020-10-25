package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem25_StoneGameIVTest {

    private final Problem25_StoneGameIV testObject = new Problem25_StoneGameIV();

    @Test
    void testWinnerSquareGame() {
        assertTrue(testObject.winnerSquareGame(1));
        assertFalse(testObject.winnerSquareGame(2));
        assertTrue(testObject.winnerSquareGame(4));
        assertFalse(testObject.winnerSquareGame(7));
        assertFalse(testObject.winnerSquareGame(17));
    }
}