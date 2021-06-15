package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick.
 * You want to use all the matchsticks to make one square.
 * You should not break any stick, but you can link them up, and each matchstick must be used exactly one time.
 * <p>
 * Return true if you can make this square and false otherwise.
 * <p>
 * Constraints:
 * <p>
 * 1 <= matchsticks.length <= 15
 * 0 <= matchsticks[i] <= 10^9
 */
public class Problem15_MatchsticksToSquare {

    public boolean makeSquare(int[] matchsticks) {
        // Special case
        if (matchsticks == null || matchsticks.length < 4) {
            return false;
        }
        // The sum of all the matchsticks should be divisible by 4
        int sum = 0;
        for (int matchstick : matchsticks) {
            sum += matchstick;
        }
        if (sum % 4 != 0) {
            return false;
        }
        // Perform DFS for all combinations
        return dfs(matchsticks, new int[4], 0, sum / 4);
    }

    private boolean dfs(int[] matchsticks, int[] sums, int index, int target) {
        // Check for terminating condition
        if (index == matchsticks.length) {
            return sums[1] == target && sums[2] == target && sums[3] == target;
        }
        for (int i = 0; i < 4; i++) {
            if (sums[i] + matchsticks[index] > target) {
                continue;
            }
            sums[i] += matchsticks[index];
            if (dfs(matchsticks, sums, index + 1, target)) {
                return true;
            }
            sums[i] -= matchsticks[index];
        }
        return false;
    }
}
