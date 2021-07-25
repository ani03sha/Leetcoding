package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a positive integer n, return the number of the integers in the range [0, n] whose binary representations
 * do not contain consecutive ones.
 * <p>
 * Constraints:
 * 1 <= n <= 10^9
 */
public class Problem25_NonNegativeIntegersWithoutConsecutiveOnes {

    public int findIntegers(int n) {
        // Special case
        if (n < 2) {
            return n + 1;
        }
        // Get the binary representation of the number.
        // It will be in the reverse order, i.e., MSB
        // will be at the beginning
        StringBuilder binaryN = new StringBuilder();
        while (n > 0) {
            if ((n & 1) == 1) {
                binaryN.append(1);
            } else {
                binaryN.append(0);
            }
            n >>>= 1;
        }
        // Convert to string and find the length
        String bitN = binaryN.toString();
        int length = binaryN.length();
        // Binary without consecutive ones that ends with one
        int[] ones = new int[length];
        // Binary without consecutive ones that ends with zero
        int[] zeroes = new int[length];
        ones[0] = 1;
        zeroes[0] = 1;
        // Fill remaining places
        for (int i = 1; i < length; i++) {
            zeroes[i] = ones[i - 1] + zeroes[i - 1];
            ones[i] = zeroes[i - 1];
        }
        // Total number of digits without consecutive ones
        int total = zeroes[length - 1] + ones[length - 1];
        // Remove binary with consecutive ones which are greater than n
        for (int i = length - 2; i >= 0; i--) {
            if (bitN.charAt(i) == '1' && bitN.charAt(i + 1) == '1') {
                break;
            }
            if (bitN.charAt(i) == '0' && bitN.charAt(i + 1) == '0') {
                total -= ones[i];
            }
        }
        return total;
    }
}
