package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of distinct integers nums and a target integer target, return the number of
 * possible combinations that add up to target.
 * <p>
 * The answer is guaranteed to fit in a 32-bit integer.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 1000
 * All the elements of nums are unique.
 * 1 <= target <= 1000
 * <p>
 * Follow up:
 * 1. What if negative numbers are allowed in the given array?
 * 2. How does it change the problem?
 * 3. What limitation we need to add to the question to allow negative numbers?
 */
public class Problem19_CombinationSumIV {

    public int combinationSum4(int[] nums, int target) {
        int[] lookup = new int[target + 1];
        Arrays.fill(lookup, -1);
        combinationSum4(nums, lookup, target);
        return lookup[target];
    }

    private int combinationSum4(int[] nums, int[] lookup, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (target == 0) {
            return 1;
        }
        if (lookup[target] != -1) {
            return lookup[target];
        }
        int count = 0;
        for (int num : nums) {
            if (target - num >= 0) {
                count += combinationSum4(nums, lookup, target - num);
            }
        }
        lookup[target] = count;
        return count;
    }
}
