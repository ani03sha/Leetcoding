package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Starting with a positive integer N, we reorder the digits in any order
 * (including the original order) such that the leading digit is not zero.
 * <p>
 * Return true if and only if we can do this in a way such that the resulting
 * number is a power of 2.
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 10^9
 */
public class Problem21_ReorderedPowerOf2 {

    public boolean reorderedPowerOf2(int N) {
        // Count the frequency of every digit
        // in the input number
        int[] inputDigitFrequency = countFrequency(N);
        // Now count the frequencies of every power of
        // two until the bigggest integer 2^31 - 1
        for (int i = 0; i < 31; i++) {
            int powerOfTwo = (int) Math.pow(2, i);
            // Count the frequencies of digits in the
            // power of two
            int[] powersOfTwoDigitFrequency = countFrequency(powerOfTwo);
            // Check if the power of two's frequency
            // is same as the input number
            if (compareFrequencies(inputDigitFrequency, powersOfTwoDigitFrequency)) {
                return true;
            }
        }
        return false;
    }

    private boolean compareFrequencies(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] countFrequency(int n) {
        // Array to store the frequencies of digits
        int[] frequencies = new int[10];
        // Loop until we reach to the zero
        while (n > 0) {
            frequencies[n % 10]++;
            n /= 10;
        }
        return frequencies;
    }
}
