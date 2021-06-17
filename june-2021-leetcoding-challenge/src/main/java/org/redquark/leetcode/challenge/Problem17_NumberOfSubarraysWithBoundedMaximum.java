package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * We are given an array nums of positive integers, and two positive integers left and right (left <= right).
 * <p>
 * Return the number of (contiguous, non-empty) subarrays such that the value of the maximum array
 * element in that subarray is at least left and at most right.
 * <p>
 * Note:
 * <p>
 * left, right, and nums[i] will be an integer in the range [0, 109].
 * The length of nums will be in the range of [1, 50000].
 */
public class Problem17_NumberOfSubarraysWithBoundedMaximum {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        // Total count will be difference of number of subarrays less
        // than right bound minus number of subarrays less than left bound.
        return countBounded(nums, right) - countBounded(nums, left - 1);
    }

    private int countBounded(int[] nums, int bound) {
        int count = 0;
        int temp = 0;
        for (int n : nums) {
            if (n <= bound) {
                temp++;
                count += temp;
            } else {
                temp = 0;
            }
        }
        return count;
    }
}
