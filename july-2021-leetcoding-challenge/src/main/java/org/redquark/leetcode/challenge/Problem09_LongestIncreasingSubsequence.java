package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 * <p>
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without
 * changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 */
public class Problem09_LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Lookup table to store the longest increasing
        // subsequence until a certain index.
        // lookup[i] => length of longest increasing sub
        // -sequence endding at index i
        int[] lookup = new int[n];
        // Since every element is an increasing sequence of
        // length 1.
        Arrays.fill(lookup, 1);
        // Loop through the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lookup[i] < lookup[j] + 1) {
                    lookup[i] = lookup[j] + 1;
                }
            }
        }
        // Find the maximum value in the lookup table
        int longest = 0;
        for (int x : lookup) {
            longest = Math.max(longest, x);
        }
        return longest;
    }
}
