package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Let's call any (contiguous) subarray B (of A) a mountain if the following properties hold:
 * <p>
 * B.length >= 3
 * There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
 * (Note that B could be any subarray of A, including the entire array A.)
 * <p>
 * Given an array A of integers, return the length of the longest mountain.
 * <p>
 * Return 0 if there is no mountain.
 * <p>
 * Note:
 * <p>
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * Follow up:
 * <p>
 * Can you solve it using only one pass?
 * Can you solve it in O(1) space?
 */
public class Problem16_LongestMountainInArray {

    /**
     * @param A - array of heights
     * @return maximum length of an array
     */
    public int longestMountain(int[] A) {
        // Base condition
        if (A == null || A.length == 0) {
            return 0;
        }
        // Length of longest mountain
        int maxLength = 0;
        // Left and right pointers
        int left = 0;
        int right = 0;
        // Loop for each element of the array
        for (int i = 1; i < A.length; i++) {
            if (right > 0 && A[i - 1] < A[i] || A[i - 1] == A[i]) {
                left = right = 0;
            }
            if (A[i - 1] < A[i]) {
                left++;
            }
            if (A[i - 1] > A[i]) {
                right++;
            }
            if (left > 0 && right > 0 && left + right + 1 > maxLength) {
                maxLength = left + right + 1;
            }
        }
        return maxLength;
    }
}
