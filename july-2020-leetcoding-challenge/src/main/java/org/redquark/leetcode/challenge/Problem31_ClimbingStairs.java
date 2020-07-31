package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 45
 */
public class Problem31_ClimbingStairs {

    /**
     * @param n - number of stairs
     * @return number of distinct ways
     */
    public int climbStairs(int n) {
        // DP array
        int[] dp = new int[n + 1];
        // Fill base cases
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
