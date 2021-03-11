package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given coins of different denominations and a total amount of money amount.
 * Write a function to compute the fewest number of coins that you need to make up that amount.
 * <p>
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 * <p>
 * You may assume that you have an infinite number of each kind of coin.
 * <p>
 * Constraints:
 * <p>
 * 1 <= coins.length <= 12
 * 1 <= coins[i] <= 2^31 - 1
 * 0 <= amount <= 10^4
 */
public class Problem11_CoinChange {

    public int coinChange(int[] coins, int amount) {
        // Table to store the minimum coins required
        // to make lookup[i]
        int[] lookup = new int[amount + 1];
        // Fill the lookup array with the invalid value
        Arrays.fill(lookup, amount + 1);
        // 0 amount requires 0 coins
        lookup[0] = 0;
        // Loop for every amount and fill the table
        // in bottom up approach
        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                // Only applicable when the current coin
                // is smaller than the current amount
                if (i - coin >= 0) {
                    // Minimum of amount minus the current coin
                    // and the coins required for current amount
                    lookup[i] = Math.min(lookup[i], 1 + lookup[i - coin]);
                }
            }
        }
        return lookup[amount] > amount ? -1 : lookup[amount];
    }
}
