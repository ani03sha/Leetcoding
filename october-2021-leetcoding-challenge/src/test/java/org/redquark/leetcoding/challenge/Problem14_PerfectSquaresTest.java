package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_PerfectSquaresTest {

    private final Problem14_PerfectSquares testObject = new Problem14_PerfectSquares();

    @Test
    void testNumSquares() {
        assertEquals(3, testObject.numSquares(12));
        assertEquals(2, testObject.numSquares(13));
    }
}