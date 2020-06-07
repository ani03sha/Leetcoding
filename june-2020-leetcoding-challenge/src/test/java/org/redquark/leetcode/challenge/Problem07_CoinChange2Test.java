package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_CoinChange2Test {

    private final Problem07_CoinChange2 testObject = new Problem07_CoinChange2();

    @Test
    void change() {
        int amount = 5;
        int[] coins = new int[]{1, 2, 5};
        assertEquals(4, testObject.change(amount, coins));

        amount = 3;
        coins = new int[]{2};
        assertEquals(0, testObject.change(amount, coins));

        amount = 10;
        coins = new int[]{10};
        assertEquals(1, testObject.change(amount, coins));
    }
}