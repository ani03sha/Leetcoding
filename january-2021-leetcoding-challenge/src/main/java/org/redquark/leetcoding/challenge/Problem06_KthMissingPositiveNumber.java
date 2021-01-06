package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 * <p>
 * Find the kth positive integer that is missing from this array.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 1000
 * 1 <= arr[i] <= 1000
 * 1 <= k <= 1000
 * arr[i] < arr[j] for 1 <= i < j <= arr.length
 */
public class Problem06_KthMissingPositiveNumber {

    /**
     * @param arr - input array
     * @param k   - kth positive integer to find
     * @return kth positive integer
     */
    public int findKthPositive(int[] arr, int k) {
        // Index to count array elements
        int arrayIndex = 0;
        // Expected number at that position
        int expectedNumber = 1;
        // Loop until k reaches 0 or we have elements in the array
        while (k > 0 && arrayIndex < arr.length) {
            // If the current expected number is present in array
            // then we will move forward in the array
            if (arr[arrayIndex] == expectedNumber) {
                arrayIndex++;
            }
            // If not, we will understand that expected number is
            // not present in the array, therefore, we found one
            // missing number
            else {
                k--;
            }
            // Update the expected number in each iteration
            expectedNumber++;
        }
        return k > 0 ? arr[arrayIndex - 1] + k : expectedNumber - 1;
    }
}
