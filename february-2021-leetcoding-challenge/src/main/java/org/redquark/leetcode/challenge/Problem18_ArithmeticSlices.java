package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A sequence of numbers is called arithmetic if it consists of at least three elements and
 * if the difference between any two consecutive elements is the same.
 * <p>
 * For example, these are arithmetic sequences:
 * <p>
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 * The following sequence is not arithmetic.
 * <p>
 * 1, 1, 2, 5, 7
 * <p>
 * A zero-indexed array A consisting of N numbers is given. A slice of that array is any
 * pair of integers (P, Q) such that 0 <= P < Q < N.
 * <p>
 * A slice (P, Q) of the array A is called arithmetic if the sequence:
 * A[P], A[P + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that
 * P + 1 < Q.
 * <p>
 * The function should return the number of arithmetic slices in the array A.
 */
public class Problem18_ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        // Global sum and current sum
        int globalSum = 0;
        int currentSum = 0;
        // Loop through the array
        for (int i = 2; i < A.length; i++) {
            // Check of Arithmetic slic property
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                currentSum++;
                globalSum += currentSum;
            } else {
                currentSum = 0;
            }
        }
        return globalSum;
    }
}
