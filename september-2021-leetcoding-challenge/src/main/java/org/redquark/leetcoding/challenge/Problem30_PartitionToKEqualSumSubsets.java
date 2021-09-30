package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums and an integer k, return true if it is possible to divide this array into k
 * non-empty subsets whose sums are all equal.
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= nums.length <= 16
 * 1 <= nums[i] <= 10^4
 * The frequency of each element is in the range [1, 4].
 */
public class Problem30_PartitionToKEqualSumSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            return false;
        }
        // Length of the array
        int n = nums.length;
        // Sum of elements of array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // If the sum is not divisible by k then it is not possible to partition
        if (sum % k != 0) {
            return false;
        }
        // Target sum of each subset
        int target = sum / k;
        // Sort the array
        Arrays.sort(nums);
        // If the last element in the sorted array is greater than the target
        // itself, then there is no way, we can partition
        if (nums[n - 1] > target) {
            return false;
        }
        // Check for all the elements in the array which are equal to the target
        int i = n - 1;
        while (i >= 0 && nums[i] == target) {
            i--;
            k--;
        }
        // Create buckets with the remaining value of k
        int[] buckets = new int[k];
        return helper(nums, i, target, buckets);
    }

    private boolean helper(int[] nums, int index, int target, int[] buckets) {
        // Base case
        if (index < 0) {
            return true;
        }
        for (int i = 0; i < buckets.length; i++) {
            // If the sum is less than or equal to target
            if (buckets[i] + nums[index] <= target) {
                buckets[i] += nums[index];
                if (helper(nums, index - 1, target, buckets)) {
                    return true;
                }
                buckets[i] -= nums[index];
            }
            if (buckets[i] == 0) {
                break;
            }
        }
        return false;
    }
}
