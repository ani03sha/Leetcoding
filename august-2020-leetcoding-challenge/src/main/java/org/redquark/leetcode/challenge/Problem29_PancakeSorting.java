package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers A, We need to sort the array performing a series of pancake flips.
 * <p>
 * In one pancake flip we do the following steps:
 * <p>
 * Choose an integer k where 0 <= k < A.length.
 * Reverse the sub-array A[0...k].
 * For example, if A = [3,2,1,4] and we performed a pancake flip choosing k = 2, we reverse the sub-array
 * [3,2,1], so A = [1,2,3,4] after the pancake flip at k = 2.
 * <p>
 * Return an array of the k-values of the pancake flips that should be performed in order to sort A.
 * Any valid answer that sorts the array within 10 * A.length flips will be judged as correct.
 * <p>
 * Constraints:
 * <p>
 * 1 <= A.length <= 100
 * 1 <= A[i] <= A.length
 * All integers in A are unique (i.e. A is a permutation of the integers from 1 to A.length).
 */
public class Problem29_PancakeSorting {

    /**
     * @param A - input array
     * @return array of pancake flips
     */
    public List<Integer> pancakeSort(int[] A) {
        // Resultant list
        List<Integer> result = new ArrayList<>();
        // Get the length of the array as the current index
        int current = A.length;
        // Loop until we reach to the first element
        while (current > 0) {
            int index = indexOf(current, A);
            if (index < current - 1) {
                // Put current at index 0
                flip(index + 1, A);
                result.add(index + 1);
                // Put current at index current - 1
                flip(current, A);
                result.add(current);
            }
            current--;
        }
        return result;
    }

    private void flip(int i, int[] A) {
        int p = 0;
        while (i - 1 - p > p) {
            swap(p, i - 1 - p, A);
            p++;
        }
    }

    private void swap(int a, int b, int[] A) {
        int c = A[a];
        A[a] = A[b];
        A[b] = c;
    }

    private int indexOf(int current, int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == current) {
                return i;
            }
        }
        return -1;
    }
}
