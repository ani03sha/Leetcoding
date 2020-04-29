package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that A is a mountain array if and only if:
 * <p>
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 */
public class Problem09_ValidMountainArray {

    /**
     * @param A - input array
     * @return true, if the array is a valid mountain
     */
    public boolean validMountainArray(int[] A) {
        // Base condition
        if (A.length < 3) {
            return false;
        }
        // This will divide the array into monotonically increasing and decreasing parts
        int index = 0;
        // This will find the index at where two parts are forming
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                return false;
            } else if (A[i + 1] < A[i]) {
                index = i;
                break;
            }
        }
        if (index > 0) {
            // Loop for the monotonically increasing part of the array
            for (int i = 0; i < index - 1; i++) {
                if (A[i] >= A[i + 1]) {
                    return false;
                }
            }
            // Loop for the monotonically decreasing part of the array
            for (int i = index + 1; i < A.length - 1; i++) {
                if (A[i + 1] >= A[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
