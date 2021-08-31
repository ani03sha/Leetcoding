package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * For example, the array nums = [0,1,2,4,5,6,7] might become:
 * <p>
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array
 * [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * <p>
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 5000
 * -5000 <= nums[i] <= 5000
 * All the integers of nums are unique.
 * nums is sorted and rotated between 1 and n times.
 */
public class Problem31_FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid array");
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until the pointers meet
        while (left < right) {
            // Find the middle index
            int middle = left + (right - left) / 2;
            // Check if the middle element is the smallest
            if (nums[middle] == nums[right]) {
                right--;
            } else if (nums[middle] > nums[right]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return nums[right];
    }
}
