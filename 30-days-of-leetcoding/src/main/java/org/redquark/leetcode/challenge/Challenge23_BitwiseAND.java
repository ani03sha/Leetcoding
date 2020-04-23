package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise
 * AND of all numbers in this range, inclusive.
 */
public class Challenge23_BitwiseAND {

    /**
     * @param m - first number
     * @param n = second number
     * @return bitwise AND of [m, n]
     * <p>
     * Algorithm;
     * 1. Loop until n > m
     * 2. AND n and n - 1
     * 3. Return AND of m and n
     */
    public int rangeBitwiseAnd(int m, int n) {
        while (n > m) {
            n &= n - 1;
        }
        return m & n;
    }
}
