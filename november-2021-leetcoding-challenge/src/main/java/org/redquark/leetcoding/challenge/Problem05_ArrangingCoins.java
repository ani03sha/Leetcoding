package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the
 * ith row has exactly i coins. The last row of the staircase may be incomplete.
 * <p>
 * Given the integer n, return the number of complete rows of the staircase you will build.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 2^31 - 1
 */
public class Problem05_ArrangingCoins {

    public int arrangeCoins(int n) {
        // Special case
        if (n <= 0) {
            return 0;
        }
        // Using Sridharacharya's formula for solving quadratic equations
        return (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2);
    }
}
