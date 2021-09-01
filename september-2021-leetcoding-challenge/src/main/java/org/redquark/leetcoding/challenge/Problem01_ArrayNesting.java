package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array nums of length n where nums is a permutation of the numbers in the range [0, n - 1].
 * <p>
 * You should build a set s[k] = {nums[k], nums[nums[k]], nums[nums[nums[k]]], ... } subjected to the following rule:
 * <p>
 * The first element in s[k] starts with the selection of the element nums[k] of index = k.
 * The next element in s[k] should be nums[nums[k]], and then nums[nums[nums[k]]], and so on.
 * We stop adding right before a duplicate element occurs in s[k].
 * Return the longest length of a set s[k].
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] < nums.length
 * All the values of nums are unique.
 */
public class Problem01_ArrayNesting {

    public int arrayNesting(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Variable to keep track of longest length
        int longestLength = 0;
        // Loop through every element of the array
        for (int i = 0; i < nums.length; i++) {
            // Get the value at current index
            int currentValue = nums[i];
            // Check if we have already traversed this element
            if (currentValue != Integer.MAX_VALUE) {
                // Variable to store current length
                int currentLength = 0;
                // Loop until we don't encounter Integer.MAX_VALUE
                while (nums[currentValue] != Integer.MAX_VALUE) {
                    // Keep track of the old value
                    int temp = currentValue;
                    // Move the pointer to the next index represented by currentValue
                    currentValue = nums[currentValue];
                    // Update the value at the index to mark it visited
                    nums[temp] = Integer.MAX_VALUE;
                    // Increment the current length
                    currentLength++;
                }
                // Update the longest length if required
                longestLength = Math.max(longestLength, currentLength);
            }
        }
        return longestLength;
    }
}
