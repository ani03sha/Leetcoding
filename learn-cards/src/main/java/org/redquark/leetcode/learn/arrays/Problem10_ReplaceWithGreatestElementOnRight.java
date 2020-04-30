package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array arr, replace every element in that array with the greatest element among the elements
 * to its right, and replace the last element with -1.
 * <p>
 * After doing so, return the array.
 */
public class Problem10_ReplaceWithGreatestElementOnRight {

    /**
     * @param arr - input array
     * @return - modified array
     * <p>
     * Algorithm:
     * 1. Loop from the end
     * 2. Keep track of the maximum element so far
     * 3. Replace each element with the max element
     */
    public int[] replaceElements(int[] arr) {
        // Length of the array
        int n = arr.length;
        // Maximum element from the right
        int max = arr[n - 1];
        // Since last element of the array will always be -1
        arr[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            // Store the current element
            int temp = arr[i];
            // Replace current element with the max element so far
            arr[i] = max;
            // Check if we need to update max
            if (max < temp) {
                max = temp;
            }
        }
        return arr;
    }
}
