package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining
 * elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written.
 * <p>
 * Do the above modifications to the input array in place, do not return anything from your function.
 */
public class Problem04_DuplicateZeros {

    /**
     * @param arr - input array
     * @return - modified array with duplicate zeros
     */
    public int[] duplicateZeros(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++, count++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (--count < n) {
                arr[count] = arr[i];
            }
            if (arr[i] == 0 && --count < n) {
                arr[count] = 0;
            }
        }
        return arr;
    }
}
