package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < A[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 10^4
 */
public class Problem10_ValidMountainArray {

    /**
     * @param arr - array of mountain heights
     * @return true, if valid mountain array, false otherwise
     */
    public boolean validMountainArray(int[] arr) {
        // Base condition
        if (arr.length < 3) {
            return false;
        }
        // Index at which inflexion occurs
        int index = 0;
        // Loop until we find the inflexion point
        for (int i = 0; i < arr.length - 1; i++) {
            // If the two adjacent values are same
            if (arr[i] == arr[i + 1]) {
                return false;
            } else if (arr[i + 1] < arr[i]) {
                index = i;
                break;
            }
        }
        // Check for the two arrays divided by the inflexion point
        if (index > 0) {
            // Strictly increasing
            for (int i = 0; i < index - 1; i++) {
                if (arr[i] >= arr[i + 1]) {
                    return false;
                }
            }
            // Strictly decreasing
            for (int i = index + 1; i < arr.length - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
