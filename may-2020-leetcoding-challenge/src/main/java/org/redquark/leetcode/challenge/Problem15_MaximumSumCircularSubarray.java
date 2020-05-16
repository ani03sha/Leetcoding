package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray
 * of C.
 * <p>
 * Here, a circular array means the end of the array connects to the beginning of the array.
 * (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)
 * <p>
 * Also, a subarray may only include each element of the fixed buffer A at most once.
 * (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j
 * with k1 % A.length = k2 % A.length.)
 */
public class Problem15_MaximumSumCircularSubarray {

    /**
     * @param A - input array
     * @return - maximum sum
     */
    public int maxSubarraySumCircular(int[] A) {
        // If all the elements are negative then we will return the maximum element out of those
        int max = Integer.MIN_VALUE;
        // This flag will set if we encounter a positive element
        boolean positive = false;
        for (int value : A) {
            if (value >= 0) {
                positive = true;
                break;
            } else {
                if (value > max) {
                    max = value;
                }
            }
        }
        if (!positive) {
            return max;
        }

        // Negate all elements of the array
        for (int i = 0; i < A.length; i++) {
            A[i] = -A[i];
        }
        // Run Kadane's algorithm on the modified array
        int negativeMaximumSum = kadane(A);

        // Restore the array
        for (int i = 0; i < A.length; i++) {
            A[i] = -A[i];
        }
        // Return maximum of
        // 1. Sum returned by Kadane's algorithm on the original array
        // 2. Sum returned by Kadane's algorithm on the inverted array + sum of all elements
        return Math.max(kadane(A), negativeMaximumSum + Arrays.stream(A).sum());
    }

    private int kadane(int[] A) {
        // Stores maximum sub array found so far
        int maxSoFar = 0;
        // Stores maximum sum of subarray ending at the current position
        int maxEndingHere = 0;
        // Traverse the given array
        for (int value : A) {
            // Update maxEndingHere by adding current element at i to the maximum sum ending
            // at previous element i - 1
            maxEndingHere = maxEndingHere + value;
            // If maxEndingHere is negative then set it to 0
            maxEndingHere = Math.max(maxEndingHere, 0);
            // Update result if current subarray sum is found to be greater
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
