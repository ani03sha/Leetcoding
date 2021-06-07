package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 * <p>
 * You can either start from the step with index 0, or the step with index 1.
 * <p>
 * Return the minimum cost to reach the top of the floor.
 * <p>
 * Constraints:
 * <p>
 * 2 <= cost.length <= 1000
 * 0 <= cost[i] <= 999
 */
public class Problem07_MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        // Special case
        if (cost == null || cost.length == 0) {
            return 0;
        }
        // Length of the array
        int n = cost.length;
        // DP array for storing the costs.
        // The value dp[i] denotes the minimum
        // cost to climb thr i-th step
        int[] dp = new int[n + 1];
        // Base values
        dp[0] = cost[0];
        dp[1] = cost[1];
        // Loop for all the steps
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + (i == n ? 0 : cost[i]);
        }
        return dp[n];
    }
}
