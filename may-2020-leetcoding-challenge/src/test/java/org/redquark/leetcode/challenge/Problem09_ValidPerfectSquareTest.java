package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem09_ValidPerfectSquareTest {

    private final Problem09_ValidPerfectSquare testObject = new Problem09_ValidPerfectSquare();

    @Test
    void isPerfectSquare() {
        assertTrue(testObject.isPerfectSquare(16));
        assertFalse(testObject.isPerfectSquare(13));
        assertTrue(testObject.isPerfectSquare(14641));
        assertFalse(testObject.isPerfectSquare(3257));
    }
}