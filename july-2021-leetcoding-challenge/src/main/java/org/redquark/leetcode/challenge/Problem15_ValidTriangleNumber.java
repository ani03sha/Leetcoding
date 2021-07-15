package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, return the number of triplets chosen from the array that can make triangles
 * if we take them as side lengths of a triangle.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 1000
 */
public class Problem15_ValidTriangleNumber {

    public int triangleNumber(int[] nums) {
        // Special case
        if (nums == null || nums.length < 3) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Count of triplets
        int count = 0;
        // Sort the array
        Arrays.sort(nums);
        // Loop through the array
        for (int i = 2; i < n; i++) {
            // Left and right pointers
            int j = 0;
            int k = i - 1;
            while (j < k) {
                if (nums[j] + nums[k] > nums[i]) {
                    count += k - j;
                    k--;
                } else {
                    j++;
                }
            }
        }
        return count;
    }
}
