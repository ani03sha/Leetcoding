package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 45
 */
public class Problem05_ClimbingStairs {

    public int climbStairs(int n) {
        // Special case
        if (n <= 2) {
            return n;
        }
        // Variables to store the ways required
        int a = 1;
        int b = 2;
        int c = 0;
        // Loop for all numbers until n
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
