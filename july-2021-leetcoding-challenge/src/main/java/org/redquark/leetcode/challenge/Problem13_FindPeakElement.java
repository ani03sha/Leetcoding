package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A peak element is an element that is strictly greater than its neighbors.
 * <p>
 * Given an integer array nums, find a peak element, and return its index.
 * If the array contains multiple peaks, return the index to any of the peaks.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * -2^31 <= nums[i] <= 2^31 - 1
 * nums[i] != nums[i + 1] for all valid i.
 */
public class Problem13_FindPeakElement {

    public int findPeakElement(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until the pointers meet
        while (left < right) {
            // Middle index
            int middle = left + (right - left) / 2;
            if (nums[middle] < nums[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}
