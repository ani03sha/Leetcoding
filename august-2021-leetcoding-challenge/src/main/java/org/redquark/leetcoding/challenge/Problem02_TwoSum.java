package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that
 * they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 */
public class Problem02_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Array to store the result
        int[] output = new int[2];
        // Special case
        if (nums == null || nums.length == 0) {
            return output;
        }
        // Map to store the difference of target and current value
        // along with the current index
        Map<Integer, Integer> differenceMap = new HashMap<>();
        // Loop through the entire array
        for (int i = 0; i < nums.length; i++) {
            // Current difference
            int difference = target - nums[i];
            if (!differenceMap.containsKey(difference)) {
                differenceMap.put(nums[i], i);
            } else {
                output[0] = differenceMap.get(difference);
                output[1] = i;
            }
        }
        return output;
    }
}
