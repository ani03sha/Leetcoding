package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l)
 * there are such that A[i] + B[j] + C[k] + D[l] is zero.
 * <p>
 * To make problem a bit easier, all A, B, C, D have same length of N where 0 ≤ N ≤ 500.
 * All integers are in the range of -2^28 to 2^28 - 1 and the result is guaranteed to be at most 2^31-1.
 */
public class Problem17_4SumII {

    /**
     * @param A - array
     * @param B - array
     * @param C - array
     * @param D - array
     * @return count of valid tuples
     */
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // Map to store the sum of A and B
        Map<Integer, Integer> sumCount = new HashMap<>();
        // Loop for all the combinations of A[i]B[j]
        for (int a : A) {
            for (int b : B) {
                sumCount.put(a + b, sumCount.getOrDefault(a + b, 0) + 1);
            }
        }
        // Count of tuples
        int count = 0;
        // Loop for all the combinations of C and D
        for (int c : C) {
            for (int d : D) {
                count += sumCount.getOrDefault(-(c + d), 0);
            }
        }
        return count;
    }
}
