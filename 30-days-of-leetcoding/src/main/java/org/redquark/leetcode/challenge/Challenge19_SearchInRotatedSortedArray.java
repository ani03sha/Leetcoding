package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * <p>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p>
 * You may assume no duplicate exists in the array.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 */
public class Challenge19_SearchInRotatedSortedArray {

    /**
     * @param numbers - input rotated array
     * @param target  - element to find
     * @return - index of the target
     * <p>
     * Algorithm:
     * 1. Find the pivot element
     * 2. Find the subarray where target is present
     * 3. Perform ordinary binary search
     */
    public int search(int[] numbers, int target) {
        // Base condition
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        // Left pointer
        int left = 0;
        // Right pointer
        int right = numbers.length - 1;
        // Find the pivot element
        while (left < right) {
            // Calculate middle point
            int middle = left + (right - left) / 2;
            // If middle element is greater than rightmost element, then it means the array is rotated
            // at the midpoint
            if (numbers[middle] > numbers[right]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        // Now we need to check in which half of the pivot our element is present
        // Index of left
        int index = left;
        left = 0;
        right = numbers.length - 1;
        if (target >= numbers[index] && target <= numbers[right]) {
            left = index;
        } else {
            right = index;
        }
        // Perform normal binary search below on the modified values of left and right
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] == target) {
                return middle;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
