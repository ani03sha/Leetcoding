package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum
 * and return its sum.
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
 * which is more subtle.
 */
public class Challenge03_MaximumSubarray {

    /**
     * @param numbers - array of numbers
     * @return - maximum sum of contiguous subarray
     * <p>
     * Algorithm - Kadane's algorithm
     * 1. Find the local maximum of the current element
     * 2. Find the maximum of current element and the sum of local maximum & current element
     * 3. If this is greater than the local maximum then assign local maximum to global maximum
     */
    public int findMaximumContiguousSum(int[] numbers) {
        // Local maximum - maximum of current subarray
        int localMaximum = 0;
        // Global maximum - Maximum of all subarrays
        int globalMaximum = Integer.MIN_VALUE;
        // Loop through the entire array
        for (int number : numbers) {
            // Find the local maximum for current element
            localMaximum = Math.max(number, number + localMaximum);
            if (globalMaximum < localMaximum) {
                globalMaximum = localMaximum;
            }
        }
        return globalMaximum;
    }
}
