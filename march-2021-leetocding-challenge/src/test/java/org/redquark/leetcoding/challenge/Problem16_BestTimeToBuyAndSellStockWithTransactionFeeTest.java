package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_BestTimeToBuyAndSellStockWithTransactionFeeTest {

    private final Problem16_BestTimeToBuyAndSellStockWithTransactionFee testObject =
            new Problem16_BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    void testMxProfit() {
        int[] prices = new int[]{1, 3, 2, 8, 4, 9};
        int fee = 2;
        assertEquals(8, testObject.maxProfit(prices, fee));

        prices = new int[]{1, 3, 2, 8, 4, 9};
        fee = 3;
        assertEquals(6, testObject.maxProfit(prices, fee));
    }
}