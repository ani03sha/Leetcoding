package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
 * followed by all the odd elements of A.
 * <p>
 * You may return any answer array that satisfies this condition.
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class Problem21_SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
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
