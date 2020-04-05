package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge05_BuyAndSellStocksTest {

    private Challenge05_BuyAndSellStocks testObject = new Challenge05_BuyAndSellStocks();

    @Test
    void findMaximumProfit() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(7, testObject.findMaximumProfit(prices));

        prices = new int[]{1, 2, 3, 4, 5};
        assertEquals(4, testObject.findMaximumProfit(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, testObject.findMaximumProfit(prices));
    }
}