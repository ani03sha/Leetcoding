package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_BestTimeToBuyAndSellStockWithCooldownTest {

    private final Problem15_BestTimeToBuyAndSellStockWithCooldown testObject = new Problem15_BestTimeToBuyAndSellStockWithCooldown();

    @Test
    void testMaxProfit() {
        int[] prices = new int[]{1, 2, 3, 0, 2};
        assertEquals(3, testObject.maxProfit(prices));

        prices = new int[]{1};
        assertEquals(0, testObject.maxProfit(prices));
    }
}