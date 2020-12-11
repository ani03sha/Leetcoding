package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most
 * twice and return the new length.
 * <p>
 * Do not allocate extra space for another array; you must do this by modifying the input array in-place
 * with O(1) extra memory.
 * <p>
 * Clarification:
 * <p>
 * Confused why the returned value is an integer, but your answer is an array?
 * <p>
 * Note that the input array is passed in by reference, which means a modification to the input array
 * will be known to the caller.
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 3 * 10^4
 * -104 <= nums[i] <= 10^4
 * nums is sorted in ascending order.
 */
public class Problem11_RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        // Length of the updated array
        int count = 0;
        // Loop for each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the element at index i+2, then skip the
            // current element because it is repeated more than twice.
            if (i < nums.length - 2 && nums[i] == nums[i + 2]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
