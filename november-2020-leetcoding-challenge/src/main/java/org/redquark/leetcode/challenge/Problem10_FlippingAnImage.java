package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the
 * resulting image.
 * <p>
 * To flip an image horizontally means that each row of the image is reversed. For example,
 * flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * <p>
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0, 1, 1] results in [1, 0, 0].
 * <p>
 * Notes:
 * <p>
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 */
public class Problem10_FlippingAnImage {

    /**
     * @param A - input binary matrix
     * @return binary matrix representing flipped images
     */
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int j = 0;
            int k = A[0].length - 1;
            while (j < k) {
                int temp = A[i][j];
                A[i][j++] = A[i][k];
                A[i][k--] = temp;
            }
            for (j = 0; j < A[i].length; j++) {
                A[i][j] = A[i][j] == 1 ? 0 : 1;
            }
        }
        return A;
    }
}
