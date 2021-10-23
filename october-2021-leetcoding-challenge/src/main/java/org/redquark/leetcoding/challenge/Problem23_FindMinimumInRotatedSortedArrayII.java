package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example,
 * the array nums = [0,1,4,4,5,6,7] might become:
 * <p>
 * [4,5,6,7,0,1,4] if it was rotated 4 times.
 * [0,1,4,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2],
 * ..., a[n-2]].
 * <p>
 * Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.
 * <p>
 * You must decrease the overall operation steps as much as possible.
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 5000
 * -5000 <= nums[i] <= 5000
 * nums is sorted and rotated between 1 and n times.
 * <p>
 * Follow up: This problem is similar to Find Minimum in Rotated Sorted Array, but nums may contain duplicates.
 * Would this affect the runtime complexity? How and why?
 */
public class Problem23_FindMinimumInRotatedSortedArrayII {

    public int findMin(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("Invalid array");
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until the two pointers meet
        while (left < right) {
            // Middle element
            int middle = left + (right - left) / 2;
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
