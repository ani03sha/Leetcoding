package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a sorted array consisting of only integers where every element appears exactly twice,
 * except for one element which appears exactly once.
 * <p>
 * Return the single element that appears only once.
 * <p>
 * Your solution must run in O(log n) time and O(1) space.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] <= 10^5
 */
public class Problem20_SingleElementInASortedArray {

    public int singleNonDuplicate(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until the pointers meet
        while (left < right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Check if mid is even or odd
            if ((middle % 2 == 0 && nums[middle] == nums[middle + 1])
                    || (middle % 2 == 1 && nums[middle - 1] == nums[middle])) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return nums[left];
    }
}
