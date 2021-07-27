package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is
 * closest to target. Return the sum of the three integers.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Constraints:
 * <p>
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 */
public class Problem27_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);
        // Length of the array
        int n = nums.length;
        // Result
        int closest = nums[0] + nums[1] + nums[n - 1];
        // Loop for each element of the array
        for (int i = 0; i < n - 2; i++) {
            // Left and right pointers
            int j = i + 1;
            int k = n - 1;
            // Loop for all other pairs
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum <= target) {
                    j++;
                } else {
                    k--;
                }
                if (Math.abs(closest - target) > Math.abs(sum - target)) {
                    closest = sum;
                }
            }
        }
        return closest;
    }
}
