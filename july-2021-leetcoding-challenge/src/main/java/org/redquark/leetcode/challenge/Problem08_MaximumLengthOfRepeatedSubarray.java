package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 100
 */
public class Problem08_MaximumLengthOfRepeatedSubarray {

    public int findLength(int[] nums1, int[] nums2) {
        // Special case
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return 0;
        }
        // Lengths of the arrays
        int m = nums1.length;
        int n = nums2.length;
        // Lookup table to store the maximum length of repeated subarray
        int[][] lookup = new int[m][n];
        // Maximum length of of repeated subarray
        int maxLength = 0;
        // Populate the table
        for (int i = 0; i < m; i++) {
            if (nums1[i] == nums2[0]) {
                maxLength = 1;
                lookup[i][0] = 1;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums1[0] == nums2[j]) {
                maxLength = 1;
                lookup[0][j] = 1;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    lookup[i][j] = lookup[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, lookup[i][j]);
                }
            }
        }
        return maxLength;
    }
}
