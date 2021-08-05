package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row,
 * and each pile has a positive integer number of stones piles[i].
 * <p>
 * The objective of the game is to end with the most stones.  The total number of stones is odd,
 * so there are no ties.
 * <p>
 * Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile
 * of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.
 * <p>
 * Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.
 * <p>
 * Constraints:
 * <p>
 * 2 <= piles.length <= 500
 * piles.length is even.
 * 1 <= piles[i] <= 500
 * sum(piles) is odd.
 */
public class Problem05_StoneGame {

    public boolean stoneGame(int[] piles) {
        /*
         * Alex is first to pick pile.
         * piles.length is even, and this lead to an interesting fact:
         * Alex can always pick odd piles or always pick even piles!
         *
         * For example,
         * If Alex wants to pick even indexed piles piles[0], piles[2], ....., piles[n-2],
         * he picks first piles[0], then Lee can pick either piles[1] or piles[n - 1].
         * Every turn, Alex can always pick even indexed piles and Lee can only pick odd indexed piles.
         *
         * In the description, we know that sum(piles) is odd.
         * If sum(piles[even]) > sum(piles[odd]), Alex just picks all evens and wins.
         * If sum(piles[even]) < sum(piles[odd]), Alex just picks all odds and wins.
         *
         * So, Alex always defeats Lee in this game.
         */
        return true;
    }
}
