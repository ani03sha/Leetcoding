package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Alice and Bob take turns playing a game, with Alice starting first.
 * <p>
 * Initially, there are n stones in a pile.  On each player's turn, that player makes a move consisting
 * of removing any non-zero square number of stones in the pile.
 * <p>
 * Also, if a player cannot make a move, he/she loses the game.
 * <p>
 * Given a positive integer n. Return True if and only if Alice wins the game otherwise return False,
 * assuming both players play optimally.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 10^5
 */
public class Problem25_StoneGameIV {

    /**
     * @param n - number of stones in a pile
     * @return true if Alice wins, false otherwise
     */
    public boolean winnerSquareGame(int n) {
        // dp[i] => Alice wins the game with i stones
        boolean[] dp = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (!dp[i - j * j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
