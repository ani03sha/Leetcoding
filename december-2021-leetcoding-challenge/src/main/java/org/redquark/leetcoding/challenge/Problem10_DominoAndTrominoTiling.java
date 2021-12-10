package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.
 * <p>
 * Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may be very large,
 * return it modulo 10^9 + 7.
 * <p>
 * In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two
 * 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 */
public class Problem10_DominoAndTrominoTiling {

    public int numTilings(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d;
        final int mod = 1000000007;
        while (--n > 0) {
            d = (c * 2 % mod + a) % mod;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
