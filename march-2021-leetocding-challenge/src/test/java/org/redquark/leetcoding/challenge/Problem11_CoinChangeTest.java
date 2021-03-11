package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_CoinChangeTest {

    private final Problem11_CoinChange testObject = new Problem11_CoinChange();

    @Test
    void testCoinChange() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        assertEquals(3, testObject.coinChange(coins, amount));

        coins = new int[]{2};
        amount = 3;
        assertEquals(-1, testObject.coinChange(coins, amount));

        coins = new int[]{1};
        amount = 0;
        assertEquals(0, testObject.coinChange(coins, amount));

        coins = new int[]{1};
        amount = 2;
        assertEquals(2, testObject.coinChange(coins, amount));

        coins = new int[]{1, Integer.MAX_VALUE};
        amount = 2;
        assertEquals(2, testObject.coinChange(coins, amount));
    }
}