package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given coins of different denominations and a total amount of money. Write a function to compute the number
 * of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.
 * <p>
 * Note:
 * <p>
 * You can assume that
 * <p>
 * 0 <= amount <= 5000
 * 1 <= coin <= 5000
 * the number of coins is less than 500
 * the answer is guaranteed to fit into signed 32-bit integer
 */
public class Problem07_CoinChange2 {

    /**
     * @param amount - total amount
     * @param coins  - array of coin denomination
     * @return - number of combinations to make up amount from the given set of coins
     */
    public int change(int amount, int[] coins) {
        int m = coins.length;
        int[][] result = new int[m + 1][amount + 1];
        result[0][0] = 1;
        for (int i = 1; i <= m; i++) {
            result[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                result[i][j] = result[i - 1][j] + (j >= coins[i - 1] ? result[i][j - coins[i - 1]] : 0);
            }
        }
        return result[m][amount];
    }
}
