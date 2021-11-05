package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_ArrangingCoinsTest {

    private final Problem05_ArrangingCoins testObject = new Problem05_ArrangingCoins();

    @Test
    void testArrangeCoins() {
        assertEquals(2, testObject.arrangeCoins(5));
        assertEquals(3, testObject.arrangeCoins(8));
        assertEquals(6864, testObject.arrangeCoins(23563356));
    }
}