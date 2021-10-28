package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 3000
 * -10^5 <= nums[i] <= 10^5
 */
public class Problem28_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        // Length of the array
        int n = nums.length;
        // Resultant list
        List<List<Integer>> triplets = new ArrayList<>();
        // Loop for each element of the array
        for (int i = 0; i < n; i++) {
            // Check for avoiding duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // Left and right pointers
            int j = i + 1;
            int k = n - 1;
            // Loop for remaining pairs
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    // Avoid duplicates
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return triplets;
    }
}
