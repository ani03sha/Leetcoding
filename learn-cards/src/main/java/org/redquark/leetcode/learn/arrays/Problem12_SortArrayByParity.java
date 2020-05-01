package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
 * followed by all the odd elements of A.
 * <p>
 * You may return any answer array that satisfies this condition.
 */
public class Problem12_SortArrayByParity {

    /**
     * @param A - input array
     * @return - sorted array by parity
     * <p>
     * Algorithm:
     * 1. Create a count variable that will keep track of the even numbers
     * 2. Check all elements one by one
     * 3. If the current element is even, then swap it with the element at current value of count
     */
    public int[] sortArrayByParity(int[] A) {
        // Even numbers' counter
        int count = 0;
        // Loop through the whole array
        for (int i = 0; i < A.length; i++) {
            // If the current element is even swap it
            if (A[i] % 2 == 0) {
                int temp = A[count];
                A[count] = A[i];
                A[i] = temp;
                count++;
            }
        }
        return A;
    }
}
