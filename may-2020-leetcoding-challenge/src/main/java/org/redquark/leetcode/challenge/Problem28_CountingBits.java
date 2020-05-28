package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of
 * 1's in their binary representation and return them as an array.
 */
public class Problem28_CountingBits {

    /**
     * @param number - input number
     * @return array of number of 1s in each element
     */
    public int[] countBits(int number) {
        // This array will store the number of 1s in each element
        int[] result = new int[number + 1];
        // This variable will track the index for the number
        int p = 1;
        // Exponent
        int power = 1;
        for (int i = 1; i <= number; i++) {
            if (i == power) {
                result[i] = 1;
                power <<= 1;
                p = 1;
            } else {
                result[i] = result[p] + 1;
                p++;
            }
        }
        return result;
    }
}
