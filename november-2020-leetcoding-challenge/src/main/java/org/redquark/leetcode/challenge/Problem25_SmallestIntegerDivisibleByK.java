package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a positive integer K, you need to find the length of the smallest positive integer N
 * such that N is divisible by K, and N only contains the digit 1.
 * <p>
 * Return the length of N. If there is no such N, return -1.
 * <p>
 * Note: N may not fit in a 64-bit signed integer.
 * <p>
 * Constraints:
 * <p>
 * 1 <= K <= 105
 */
public class Problem25_SmallestIntegerDivisibleByK {

    /**
     * @param K - input integer
     * @return length of smallest positive integer
     */
    public int smallestRepunitDivByK(int K) {
        if (K % 2 == 0 || K % 5 == 0) {
            return -1;
        }
        int number = 0;
        for (int i = 1; i <= K; i++) {
            number = (number * 10 + 1) % K;
            if (number == 0) {
                return i;
            }
        }
        return -1;
    }
}
