package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty array nums containing only positive integers, find if the array can be partitioned
 * into two subsets such that the sum of elements in both subsets is equal.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 */
public class Problem27_PartitionEqualSubsetSum {

    /**
     * @param nums - array of positive integers
     * @return true, if partition is possible, false, otherwise
     */
    public boolean canPartition(int[] nums) {
        // Sum of array elements
        int total = Arrays.stream(nums).sum();
        // Primary condition is that the total sum of array elements should be even.
        // Only then we will be able to divide the aray into two subsets of equal sum.
        if (total % 2 == 1) {
            return false;
        }
        return canPartition(nums, 0, 0, total, new HashMap<>());
    }

    private boolean canPartition(int[] nums, int index, int currentSum, int total, Map<String, Boolean> state) {
        String currentState = index + "" + currentSum;
        if (state.containsKey(currentState)) {
            return state.get(currentState);
        }
        // Base case for recursive calls
        if (currentSum * 2 == total) {
            return true;
        }
        // If the current sum is greater than half of the total sum then
        // partition is not possible
        if (currentSum > total / 2 || index >= nums.length) {
            return false;
        }
        boolean foundPartition = canPartition(nums, index + 1, currentSum, total, state)
                || canPartition(nums, index + 1, currentSum + nums[index], total, state);
        state.put(currentState, foundPartition);
        return foundPartition;
    }
}
