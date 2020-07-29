package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_BestTimeToBuyAndSellStocksWithCooldownTest {

    private final Problem29_BestTimeToBuyAndSellStocksWithCooldown testObject =
            new Problem29_BestTimeToBuyAndSellStocksWithCooldown();

    @Test
    void testMaxProfit() {
        int[] prices = new int[]{1, 2, 3, 0, 2};
        assertEquals(3, testObject.maxProfit(prices));
    }
}