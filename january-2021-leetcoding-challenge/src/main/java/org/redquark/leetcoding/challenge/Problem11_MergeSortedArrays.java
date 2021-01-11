package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * <p>
 * You may assume that nums1 has enough space (size that is equal to m + n) to hold additional
 * elements from nums2.
 * <p>
 * Constraints:
 * <p>
 * 0 <= n, m <= 200
 * 1 <= n + m <= 200
 * nums1.length == m + n
 * nums2.length == n
 * -10^9 <= nums1[i], nums2[i] <= 10^9
 */
public class Problem11_MergeSortedArrays {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // Variable to define the index of the merged sorted array
        int index = nums1.length - 1;
        // Decrement m and n by one to define the respective large
        // indices of the arrays
        --m;
        --n;
        // Loop for both the arrays
        while (m >= 0 && n >= 0) {
            // Check for the bigger elements in the arrays
            if (nums1[m] > nums2[n]) {
                nums1[index] = nums1[m];
                m--;
                index--;
            } else {
                nums1[index] = nums2[n];
                n--;
                index--;
            }
        }
        // If some elements are left in the second array
        while (n >= 0) {
            nums1[index] = nums2[n];
            index--;
            n--;
        }
        return nums1;
    }
}
