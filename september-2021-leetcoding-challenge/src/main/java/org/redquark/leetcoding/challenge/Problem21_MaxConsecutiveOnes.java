package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * nums[i] is either 0 or 1.
 */
public class Problem21_MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Left and right pointers
        int left = 0;
        int right = 0;
        // Length of max consecutive ones
        int maxLength = 0;
        // Loop through the array
        while (right < n) {
            // Increment right pointer as long we are encountering 1
            while (right < n && nums[right] == 1) {
                right++;
            }
            // Update the max length, if required
            maxLength = Math.max(maxLength, right - left);
            // Update the left pointer
            left = right;
            // // Increment the left pointer as long we are encountering 0
            while (left < n && nums[left] == 0) {
                left++;
            }
            right++;
        }
        return maxLength;
    }
}
