package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Two images A and B are given, represented as binary, square matrices of the same size.
 * (A binary matrix has only 0s and 1s as values.)
 * <p>
 * We translate one image however we choose (sliding it left, right, up, or down any number of units),
 * and place it on top of the other image.  After, the overlap of this translation is the number of
 * positions that have a 1 in both images.
 * <p>
 * (Note also that a translation does not include any kind of rotation.)
 * <p>
 * What is the largest possible overlap?
 * <p>
 * Notes:
 * <p>
 * 1 <= A.length = A[0].length = B.length = B[0].length <= 30
 * 0 <= A[i][j], B[i][j] <= 1
 */
public class Problem06_ImageOverlap {

    /**
     * @param A - matrix for first image
     * @param B - matrix for second image
     * @return - count of overlap
     */
    public int largestOverlap(int[][] A, int[][] B) {
        int N = A.length;
        List<Integer> LA = new ArrayList<>();
        List<Integer> LB = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < N * N; ++i)
            if (A[i / N][i % N] == 1)
                LA.add(i / N * 100 + i % N);
        for (int i = 0; i < N * N; ++i)
            if (B[i / N][i % N] == 1)
                LB.add(i / N * 100 + i % N);
        for (int i : LA)
            for (int j : LB)
                count.put(i - j, count.getOrDefault(i - j, 0) + 1);
        int result = 0;
        for (int i : count.values())
            result = Math.max(result, i);
        return result;
    }
}
