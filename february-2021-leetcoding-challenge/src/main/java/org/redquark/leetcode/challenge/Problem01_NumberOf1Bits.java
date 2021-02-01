package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the
 * Hamming weight).
 * <p>
 * Note:
 * <p>
 * Note that in some languages such as Java, there is no unsigned integer type.
 * In this case, the input will be given as a signed integer type.
 * It should not affect your implementation, as the integer's internal binary representation is the same,
 * whether it is signed or unsigned.
 * <p>
 * In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 3 above, the input represents the signed integer. -3.
 * <p>
 * Follow up: If this function is called many times, how would you optimize it?
 * <p>
 * Constraints:
 * <p>
 * The input must be a binary string of length 32
 */
public class Problem01_NumberOf1Bits {

    /**
     * @param n - input integer
     * @return number of 1 bits
     */
    public int hammingWeight(int n) {
        // Total count of 1 bits
        int count = 0;
        // Loop until n becomes 0
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
