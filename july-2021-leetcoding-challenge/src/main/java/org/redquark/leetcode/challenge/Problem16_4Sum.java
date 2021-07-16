package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c],
 * nums[d]] such that:
 * <p>
 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 200
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 */
public class Problem16_4Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Resultant list
        List<List<Integer>> quadruplets = new ArrayList<>();
        // Base condition
        if (nums == null || nums.length < 4) {
            return quadruplets;
        }
        // Sort the array
        Arrays.sort(nums);
        // Length of the array
        int n = nums.length;
        // Loop for each element in the array
        for (int i = 0; i < n - 3; i++) {
            // Check for skipping duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // Reducing problem to 3Sum problem
            for (int j = i + 1; j < n - 2; j++) {
                // Check for skipping duplicates
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                // Left and right pointers
                int k = j + 1;
                int l = n - 1;
                // Reducing to two sum problem
                while (k < l) {
                    int currentSum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (currentSum < target) {
                        k++;
                    } else if (currentSum > target) {
                        l--;
                    } else {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        // Check for skipping duplicates
                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }
        return quadruplets;
    }
}
