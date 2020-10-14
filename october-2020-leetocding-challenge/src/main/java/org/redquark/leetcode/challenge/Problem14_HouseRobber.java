package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount
 * of money stashed. All houses at this place are arranged in a circle.
 * <p>
 * That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a
 * security system connected, and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * <p>
 * Given a list of non-negative integers nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 1000
 */
public class Problem14_HouseRobber {

    /**
     * @param nums - input array
     * @return maximum loot
     */
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
        }
    }

    private int rob(int[] nums, int start, int end) {
        int with = nums[start];
        int without = 0;
        for (int i = start + 1; i <= end; i++) {
            int newWith = without + nums[i];
            int newWithout = Math.max(with, without);
            with = newWith;
            without = newWithout;
        }
        return Math.max(with, without);
    }
}
