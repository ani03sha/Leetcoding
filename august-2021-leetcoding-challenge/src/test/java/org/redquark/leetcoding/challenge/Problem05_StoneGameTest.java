package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem05_StoneGameTest {

    private final Problem05_StoneGame testObject = new Problem05_StoneGame();

    @Test
    void testStoneGame() {
        int[] piles = {5, 3, 4, 5};
        assertTrue(testObject.stoneGame(piles));
    }
}