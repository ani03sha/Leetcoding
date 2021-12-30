package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a positive integer k, you need to find the length of the smallest positive integer n such that n is
 * divisible by k, and n only contains the digit 1.
 * <p>
 * Return the length of n. If there is no such n, return -1.
 * <p>
 * Note: n may not fit in a 64-bit signed integer.
 */
public class Problem30_SmallestIntegerDivisibleByK {

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
