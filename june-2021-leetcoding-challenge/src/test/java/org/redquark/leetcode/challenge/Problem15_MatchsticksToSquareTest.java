package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem15_MatchsticksToSquareTest {

    private final Problem15_MatchsticksToSquare testObject = new Problem15_MatchsticksToSquare();

    @Test
    void testMakeSquare() {
        int[] matchsticks = new int[]{1, 1, 2, 2, 2};
        assertTrue(testObject.makeSquare(matchsticks));

        matchsticks = new int[]{3, 3, 3, 3, 4};
        assertFalse(testObject.makeSquare(matchsticks));
    }
}