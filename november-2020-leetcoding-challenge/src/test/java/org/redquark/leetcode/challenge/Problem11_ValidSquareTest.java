package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem11_ValidSquareTest {

    private final Problem11_ValidSquare testObject = new Problem11_ValidSquare();

    @Test
    void validSquare() {
        assertTrue(
                testObject.validSquare(
                        new int[]{0, 0},
                        new int[]{1, 1},
                        new int[]{1, 0},
                        new int[]{0, 1}
                )
        );
    }
}