package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_PerfectSquaresTest {

    private final Problem27_PerfectSquares testObject = new Problem27_PerfectSquares();

    @Test
    void testNumSquares() {
        assertEquals(1, testObject.numSquares(25));
        assertEquals(3, testObject.numSquares(12));
        assertEquals(2, testObject.numSquares(13));
    }
}