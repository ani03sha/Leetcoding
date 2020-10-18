package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_BestTimeToBuyAndSellStocksIVTest {

    private final Problem18_BestTimeToBuyAndSellStocksIV testObject =
            new Problem18_BestTimeToBuyAndSellStocksIV();

    @Test
    void testMaxProfit() {
        int[] prices = new int[]{2, 4, 1};
        int k = 2;
        assertEquals(2, testObject.maxProfit(k, prices));

        prices = new int[]{3, 2, 6, 5, 0, 3};
        k = 2;
        assertEquals(7, testObject.maxProfit(k, prices));
    }
}