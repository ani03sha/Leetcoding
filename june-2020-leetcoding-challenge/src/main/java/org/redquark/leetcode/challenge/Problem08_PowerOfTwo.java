package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer, write a function to determine if it is a power of two.
 */
public class Problem08_PowerOfTwo {

    /**
     * @param n - input number
     * @return true, if the input number is power of two
     */
    public boolean isPowerOfTwo(int n) {
        long i = 1;
        while (i < n) {
            i *= 2;
        }
        return i == n;
    }
}
