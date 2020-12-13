package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_BurstBalloonsTest {

    private final Problem13_BurstBalloons testObject = new Problem13_BurstBalloons();

    @Test
    void testMaxCoins() {
        assertEquals(167, testObject.maxCoins(new int[]{3, 1, 5, 8}));
    }
}