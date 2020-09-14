package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security
 * system connected and it will automatically contact the police if two adjacent houses were broken into on the
 * same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum
 * amount of money you can rob tonight without alerting the police.
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class Problem14_HouseRobber {

    /**
     * @param numbers - money in each house
     * @return - maximum money
     */
    public int rob(int[] numbers) {
        // Base conditions
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }
        if (numbers.length == 2) {
            return Math.max(numbers[0], numbers[1]);
        }
        // DP array
        int[] dp = new int[numbers.length];
        dp[0] = numbers[0];
        dp[1] = Math.max(numbers[0], numbers[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(numbers[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[numbers.length - 1];
    }
}
