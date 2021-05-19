package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
 * <p>
 * In one move, you can increment or decrement an element of the array by 1.
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */
public class Problem19_MinimumMovesToEqualArrayElementsII {

    public int minMoves2(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Sort the array
        Arrays.sort(nums);
        // Find the median of the array
        int median = nums[nums.length / 2];
        // Variable to store the minimum number of moves required
        int moves = 0;
        // Traverse through the array and calculate steps to make
        // every element equal to the median calculated
        for (int num : nums) {
            moves += Math.abs(num - median);
        }
        return moves;
    }
}
