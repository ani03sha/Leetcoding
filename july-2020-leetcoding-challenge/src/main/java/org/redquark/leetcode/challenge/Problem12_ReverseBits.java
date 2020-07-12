package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * Note:
 * <p>
 * Note that in some languages such as Java, there is no unsigned integer type.
 * <p>
 * In this case, both input and output will be given as signed integer type and should not affect your implementation,
 * as the internal binary representation of the integer is the same whether it is signed or unsigned.
 * <p>
 * In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 2 above the input represents the signed integer -3 and the output represents the signed integer -1073741825.
 * <p>
 * Follow up:
 * <p>
 * If this function is called many times, how would you optimize it?
 */
public class Problem12_ReverseBits {

    /**
     * @param n - input number
     * @return reverse bits
     */
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }
        return result;
    }
}
