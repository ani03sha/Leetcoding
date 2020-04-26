package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
 * also in sorted non-decreasing order.
 * <p>
 * Example 1:
 * <p>
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 * <p>
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 */
public class Problem03_SquaresOfSortedArray {

    /**
     * @param A - input array
     * @return sorted square array
     * <p>
     * Algorithm:
     * 1. Divide the array into positive and negative arrays
     * 2. Merge the squares of these arrays (merge function of merge sort)
     */
    public int[] sortedSquares(int[] A) {
        // Length of the array
        int n = A.length;
        // Find the index from where non-negative part starts
        int index = 0;
        while (index < n && A[index] < 0) {
            index++;
        }
        // Now, this represents the first non-negative element
        int positiveIndex = index;
        int negativeIndex = index - 1;
        // Create a new array that will save the squares of elements in A
        int[] squareA = new int[n];
        // Counter for squareA
        int count = 0;
        while (negativeIndex >= 0 && positiveIndex < n) {
            if (A[negativeIndex] * A[negativeIndex] < A[positiveIndex] * A[positiveIndex]) {
                squareA[count] = A[negativeIndex] * A[negativeIndex];
                negativeIndex--;
            } else {
                squareA[count] = A[positiveIndex] * A[positiveIndex];
                positiveIndex++;
            }
            count++;
        }
        // Check for remaining negative elements in the array, if any
        while (negativeIndex >= 0) {
            squareA[count] = A[negativeIndex] * A[negativeIndex];
            negativeIndex--;
            count++;
        }
        // Check for remaining positive elements in the array, if any
        while (positiveIndex < n) {
            squareA[count] = A[positiveIndex] * A[positiveIndex];
            positiveIndex++;
            count++;
        }
        return squareA;
    }
}
