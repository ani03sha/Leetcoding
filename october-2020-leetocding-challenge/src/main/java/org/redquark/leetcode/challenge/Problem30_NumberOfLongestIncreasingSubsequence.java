package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, return the number of longest increasing subsequences.
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 2000
 * -10^6 <= nums[i] <= 10^6
 */
public class Problem30_NumberOfLongestIncreasingSubsequence {

    /**
     * @param nums - input array
     * @return total number of longest increasing subsequences
     */
    public int findNumberOfLIS(int[] nums) {
        // Base condition
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // lengths[i] is the length of longest increasing subsequence ends with nums[i]
        int[] lengths = new int[n];
        // counts[i] is the number of longest increasing subsequence ends with nums[i]
        int[] counts = new int[n];
        // Fill both arrays with 1 as the initial value
        Arrays.fill(lengths, 1);
        Arrays.fill(counts, 1);
        // Loop for elements in the array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (lengths[j] + 1 == lengths[i]) {
                        counts[i] += counts[j];
                    } else if (lengths[j] + 1 > lengths[i]) {
                        lengths[i] = lengths[j] + 1;
                        counts[i] = counts[j];
                    }
                }
            }
        }
        // Max length
        int maxLength = 1;
        for (int l : lengths) {
            maxLength = Math.max(maxLength, l);
        }
        // Result
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (maxLength == lengths[i]) {
                result += counts[i];
            }
        }
        return result;
    }
}
