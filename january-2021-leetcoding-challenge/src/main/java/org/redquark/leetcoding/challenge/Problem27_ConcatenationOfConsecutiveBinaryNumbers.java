package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer n, return the decimal value of the binary string formed by concatenating
 * the binary representations of 1 to n in order, modulo 10^9 + 7.
 * <p>
 * Constraints:
 * 1 <= n <= 10^5
 */
public class Problem27_ConcatenationOfConsecutiveBinaryNumbers {

    /**
     * @param n - last value of the integer
     * @return converted decimal after concatenation
     */
    public int concatenatedBinary(int n) {
        // We will use the formula of concatenating two binary numbers M and N.
        // 1. First find the number of bits in N say k.
        // 2. Then left shift M by k.
        // 3. Add the result to N.
        // 4. The final formula is M << k + N.

        // Number of bits in each integers
        int bits = 0;
        // Final result
        long result = 0;
        // Loop from 1 to n, inclusive
        for (int i = 1; i <= n; i++) {
            // For powers of two, we increase bits by 1
            if ((i & (i - 1)) == 0) {
                bits += 1;
            }
            result = ((result << bits) | i) % 1000000007;
        }
        return (int) result;
    }
}
