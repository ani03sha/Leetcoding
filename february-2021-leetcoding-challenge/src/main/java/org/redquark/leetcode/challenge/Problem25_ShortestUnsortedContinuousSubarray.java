package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, you need to find one continuous subarray that if you only
 * sort this subarray in ascending order, then the whole array will be sorted in ascending order.
 * <p>
 * Return the shortest such subarray and output its length.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -10^5 <= nums[i] <= 10^5
 * <p>
 * <p>
 * Follow up: Can you solve it in O(n) time complexity?
 */
public class Problem25_ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        // Minimum and maximum elements in the
        // unsorted portion of the array
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        // Loop through the array from left to right
        for (int i = 1; i < nums.length; i++) {
            // Check if the element is out of order
            if (nums[i] < nums[i - 1]) {
                minimum = Math.min(nums[i], minimum);
            }
        }
        // Loop through the array from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            // Check if the element is out of order
            if (nums[i] > nums[i + 1]) {
                maximum = Math.max(nums[i], maximum);
            }
        }
        // Left and right pointers which denote the
        // boundaries of the unsorted subarray
        int left = 0;
        int right = nums.length - 1;
        while (left < nums.length) {
            if (minimum < nums[left]) {
                break;
            }
            left++;
        }
        while (right >= 0) {
            if (maximum > nums[right]) {
                break;
            }
            right--;
        }
        return right - left < 0 ? 0 : right - left + 1;
    }
}
