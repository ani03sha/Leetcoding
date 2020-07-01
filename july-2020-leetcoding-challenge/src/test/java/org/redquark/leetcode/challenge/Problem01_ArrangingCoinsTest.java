package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_ArrangingCoinsTest {

    private final Problem01_ArrangingCoins testObject = new Problem01_ArrangingCoins();

    @Test
    void testArrangeCoins() {
        assertEquals(2, testObject.arrangeCoins(5));
        assertEquals(3, testObject.arrangeCoins(8));
        assertEquals(5, testObject.arrangeCoins(19));
        assertEquals(60070, testObject.arrangeCoins(1804289383));
    }
}