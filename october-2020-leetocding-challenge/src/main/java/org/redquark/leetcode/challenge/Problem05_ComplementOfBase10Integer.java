package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Every non-negative integer N has a binary representation. For example, 5 can be represented as "101"
 * in binary, 11 as "1011" in binary, and so on.
 * <p>
 * Note that except for N = 0, there are no leading zeroes in any binary representation.
 * <p>
 * The complement of a binary representation is the number in binary you get when changing every 1 to a 0
 * and 0 to a 1.  For example, the complement of "101" in binary is "010" in binary.
 * <p>
 * For a given number N in base-10, return the complement of it's binary representation as a base-10 integer.
 */
public class Problem05_ComplementOfBase10Integer {

    /**
     * @param N - input number
     * @return - complement
     */

    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        // Number of bits
        int numberOfBits = (int) (Math.log(N) / Math.log(2) + 1);
        // Biggest number represented by the number of bits calculated
        int biggestNumber = (int) (Math.pow(2, numberOfBits) - 1);
        return biggestNumber - N;
    }
}
