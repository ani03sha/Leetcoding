package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
 * <p>
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 */
public class Problem03_SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // List to store output
        List<List<Integer>> output = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return output;
        }
        // Sort the array
        Arrays.sort(nums);
        // Create subsets
        createSubsets(nums, 0, nums.length, new ArrayList<>(), output);
        return output;
    }

    private void createSubsets(int[] nums, int start, int length, List<Integer> current, List<List<Integer>> output) {
        output.add(new ArrayList<>(current));
        for (int i = start; i < length; i++) {
            if (i == start || nums[i] != nums[i - 1]) {
                current.add(nums[i]);
                createSubsets(nums, i + 1, length, current, output);
                current.remove(current.size() - 1);
            }
        }
    }
}
