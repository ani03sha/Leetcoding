package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * In a row of dominoes, A[i] and B[i] represent the top and bottom halves of the ith domino.
 * (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)
 * <p>
 * We may rotate the ith domino, so that A[i] and B[i] swap values.
 * <p>
 * Return the minimum number of rotations so that all the values in A are the same, or all the values in
 * B are the same.
 * <p>
 * If it cannot be done, return -1.
 * <p>
 * Constraints:
 * <p>
 * 2 <= A.length == B.length <= 2 * 10^4
 * 1 <= A[i], B[i] <= 6
 */
public class Problem19_MinimumDominoRotationsForEqualRow {

    /**
     * @param A - Array representation of top of dominoes
     * @param B - Array representation of bottom of dominoes
     * @return - minimum number of rotations to make all values same
     */
    public int minDominoRotations(int[] A, int[] B) {
        // Length of the arrays
        int n = A.length;
        // Test for A
        for (int i = 0, a = 0, b = 0; i < n && (A[i] == A[0] || B[i] == A[0]); i++) {
            if (A[i] != A[0]) {
                a++;
            }
            if (B[i] != A[0]) {
                b++;
            }
            if (i == n - 1) {
                return Math.min(a, b);
            }
        }
        // Test for B
        for (int i = 0, a = 0, b = 0; i < n && (A[i] == B[0] || B[i] == B[0]); i++) {
            if (A[i] != B[0]) {
                a++;
            }
            if (B[i] != B[0]) {
                b++;
            }
            if (i == n - 1) {
                return Math.min(a, b);
            }
        }
        return -1;
    }
}
