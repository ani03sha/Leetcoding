package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p>
 * You can assume that you can always reach the last index.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 10^5
 */
public class Problem05_JumpGameII {

    public int jump(int[] nums) {
        // Index of current reach
        int currentReach = 0;
        // Index of maximum reach
        int maxReach = 0;
        // Jumps taken so far
        int jumps = 0;
        // Loop through the array
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + nums[i] > maxReach) {
                maxReach = i + nums[i];
            }
            if (i == currentReach) {
                jumps++;
                currentReach = maxReach;
            }
        }
        return jumps;
    }
}
