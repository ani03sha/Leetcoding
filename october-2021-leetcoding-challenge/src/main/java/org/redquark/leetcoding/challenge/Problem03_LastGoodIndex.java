package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * 0 <= nums[i] <= 10^5
 */
public class Problem03_LastGoodIndex {

    public boolean canJump(int[] nums) {
        // Special case
        if (nums == null || nums.length < 2) {
            return true;
        }
        // Length of the array
        int n = nums.length;
        // Last good index from where we can reach the end
        int lastGoodIndex = n - 1;
        // Loop from right to left in the array
        for (int i = n - 1; i >= 0; i--) {
            // Check if jumping to last index is possible
            // from the current index
            if (i + nums[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0;
    }
}
