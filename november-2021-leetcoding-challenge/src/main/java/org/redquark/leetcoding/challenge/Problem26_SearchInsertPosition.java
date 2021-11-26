package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class Problem26_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until the pointers meet
        while (left <= right) {
            // Middle index of the current range
            int middle = left + (right - left) / 2;
            // If the target is found is at the middle index
            if (nums[middle] == target) {
                return middle;
            }
            // Check if the target is greater than the middle element
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            // Check if the target is smaller than the middle element
            else {
                right = middle - 1;
            }
        }
        return left;
    }
}
