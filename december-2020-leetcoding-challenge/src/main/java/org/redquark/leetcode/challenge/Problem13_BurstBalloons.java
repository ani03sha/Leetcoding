package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it
 * represented by array nums. You are asked to burst all the balloons.
 * <p>
 * If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins.
 * Here left and right are adjacent indices of i.
 * <p>
 * After the burst, the left and right then becomes adjacent.
 * <p>
 * Find the maximum coins you can collect by bursting the balloons wisely.
 * <p>
 * Note:
 * <p>
 * You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
 * 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
 */
public class Problem13_BurstBalloons {

    /**
     * @param nums - array of balloons
     * @return - maximum coins
     */
    public int maxCoins(int[] nums) {
        // There will be head and tail i.e., which will define
        // index at -1 and n respectively
        int[] a = new int[nums.length + 2];
        // Initialize head and tail indices
        a[0] = 1;
        a[a.length - 1] = 1;
        // Copy nums into a
        System.arraycopy(nums, 0, a, 1, nums.length);
        // DP array - dp[i][j] => max coins at step i by bursting j
        int[][] dp = new int[a.length][a.length];
        // DP array is 1 index based
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = i; j >= 1; j--) {
                // K as last
                for (int k = j; k <= i; k++) {
                    dp[j][i] = Math.max(a[j - 1] * a[k] * a[i + 1] + dp[j][k - 1] + dp[k + 1][i],
                            dp[j][i]);
                }
            }
        }
        return dp[1][a.length - 2];
    }
}
