package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * <p>
 * If target is not found in the array, return [-1, -1].
 * <p>
 * Follow up: Could you write an algorithm with O(log n) runtime complexity?
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * nums is a non-decreasing array.
 * -10^9 <= target <= 10^9
 */
public class Problem29_FindFirstAndLastPositionOfElementInSortedArray {

    private static int findFirstOccurrence(int[] nums, int target) {
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Index of first occurrence
        int firstOccurrence = -1;
        // Loop until the two pointers meet
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Check if we have found the value
            if (nums[middle] == target) {
                firstOccurrence = middle;
                right = middle - 1;
            }
            // If the target is less than the element
            // at the middle index
            else if (target < nums[middle]) {
                right = middle - 1;
            }
            // If the target is greater than the element
            // at the middle index
            else {
                left = middle + 1;
            }
        }
        return firstOccurrence;
    }

    private static int findLastOccurrence(int[] nums, int target) {
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Index of first occurrence
        int lastOccurrence = -1;
        // Loop until the two pointers meet
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Check if we have found the value
            if (nums[middle] == target) {
                lastOccurrence = middle;
                left = middle + 1;
            }
            // If the target is less than the element
            // at the middle index
            else if (target < nums[middle]) {
                right = middle - 1;
            }
            // If the target is greater than the element
            // at the middle index
            else {
                left = middle + 1;
            }
        }
        return lastOccurrence;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirstOccurrence(nums, target), findLastOccurrence(nums, target)};
    }
}
