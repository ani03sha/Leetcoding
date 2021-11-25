package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the
 * largest sum and return its sum.
 * <p>
 * A subarray is a contiguous part of an array.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * -104 <= nums[i] <= 10^4
 * <p>
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and
 * conquer approach, which is more subtle.
 */
public class Problem25_MaximumSubarray {

    public int maxSubArray(int[] nums) {
        // Base case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // This variable will store the maximum sum
        // in a subarray
        int globalMax = nums[0];
        // This variable will store the maximum sum
        // until that index
        int localMax = nums[0];
        // Loop through every other element in the array
        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(localMax + nums[i], nums[i]);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
