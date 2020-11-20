package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
 * <p>
 * You are given a target value to search. If found in the array return true, otherwise return false.
 * <p>
 * Follow up:
 * <p>
 * This is a follow up problem to Search in Rotated Sorted Array, where nums may contain
 * duplicates.
 * Would this affect the run-time complexity? How and why?
 */
public class Problem20_SearchInRotatedSortedArrayII {

    /**
     * @param nums   - array of numbers
     * @param target - number to search
     * @return true, if number is found, false otherwise
     */
    public boolean search(int[] nums, int target) {
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Bianry search
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // If number is found
            if (nums[middle] == target) {
                return true;
            }
            // If the left half is correctly sorted i.e., it doesn't have pivot
            if (nums[left] < nums[middle]) {
                // If the number lies in the left half
                if (nums[left] <= target && target < nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
            // If the left half is not correctly sorted i.e., it has pivot
            else if (nums[left] > nums[middle]) {
                if (nums[middle] < target && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                left++;
            }
        }
        return false;
    }
}
