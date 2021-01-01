package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array of distinct integers arr and an array of integer arrays pieces,
 * where the integers in pieces are distinct.
 * <p>
 * Your goal is to form arr by concatenating the arrays in pieces in any order.
 * However, you are not allowed to reorder the integers in each array pieces[i].
 * <p>
 * Return true if it is possible to form the array arr from pieces. Otherwise, return false.
 * <p>
 * Constraints:
 * <p>
 * 1 <= pieces.length <= arr.length <= 100
 * sum(pieces[i].length) == arr.length
 * 1 <= pieces[i].length <= arr.length
 * 1 <= arr[i], pieces[i][j] <= 100
 * The integers in arr are distinct.
 * The integers in pieces are distinct (i.e., If we flatten pieces in a 1D array, all the integers
 * in this array are distinct).
 */
public class Problem01_CheckArrayFormationThroughConcatenation {

    /**
     * @param arr    - input array
     * @param pieces - input array
     * @return true, if formation is possible, false otherwise
     */
    public boolean canFormArray(int[] arr, int[][] pieces) {
        // Array to store the positions of the
        // elements in arr (1-indexed)
        int[] indices = new int[101];
        for (int i = 0; i < arr.length; i++) {
            indices[arr[i]] = i + 1;
        }
        // Loop through the pieces array
        for (int[] piece : pieces) {
            // Check if the first element exists in the array
            // If it does, then its value can never be zero,
            if (indices[piece[0]] == 0) {
                return false;
            }
            // Else, we need to check if the difference
            // indices of adjacent elements is one or not
            for (int i = 1; i < piece.length; i++) {
                if (indices[piece[i]] - indices[piece[i - 1]] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
