package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * We have some permutation A of [0, 1, ..., N - 1], where N is the length of A.
 * <p>
 * The number of (global) inversions is the number of i < j with 0 <= i < j < N and A[i] > A[j].
 * <p>
 * The number of local inversions is the number of i with 0 <= i < N and A[i] > A[i+1].
 * <p>
 * Return true if and only if the number of global inversions is equal to the number of local inversions.
 * <p>
 * Note:
 * <p>
 * A will be a permutation of [0, 1, ..., A.length - 1].
 * A will have length in range [1, 5000].
 * The time limit for this problem has been reduced.
 */
public class Problem05_GlobalAndLocalInversions {

    public boolean isIdealPermutation(int[] A) {
        // Max element until the current iteration
        int max = Integer.MIN_VALUE;
        // Loop through the entire array
        for (int i = 0; i < A.length - 2; i++) {
            max = Math.max(max, A[i]);
            if (max > A[i + 2]) {
                return false;
            }
        }
        return true;
    }
}
