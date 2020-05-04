package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 * <p>
 * Note:
 * <p>
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 */
public class Problem04_NumberComplement {

    public int findComplement(int n) {
        // Number of bits
        int numberOfBits = (int) (Math.log(n) / Math.log(2) + 1);
        // Loop through all the bits
        for (int i = 0; i < numberOfBits; i++) {
            // 1 << i => shifts 1 by i bits
            n = n ^ (1 << i);
        }
        return n;
    }
}
