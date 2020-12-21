package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array A of integers, for each integer A[i] we need to choose either x = -K or
 * x = K, and add x to A[i] (only once).
 * <p>
 * After this process, we have some array B.
 * <p>
 * Return the smallest possible difference between the maximum value of B and the minimum
 * value of B.
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * 0 <= K <= 10000
 */
public class Problem21_SmallestRangeII {

    public int smallestRangeII(int[] A, int K) {
        // Sort the array
        Arrays.sort(A);
        // The smallest range
        int range = A[A.length - 1] - A[0];
        // Max value
        int left = A[0] + K;
        // Min value
        int right = A[A.length - 1] - K;
        // Loop through the array
        for (int i = 0; i < A.length - 1; i++) {
            int min = Math.min(left, A[i + 1] - K);
            int max = Math.max(right, A[i] + K);
            range = Math.min(range, max - min);
        }
        return range;
    }
}
