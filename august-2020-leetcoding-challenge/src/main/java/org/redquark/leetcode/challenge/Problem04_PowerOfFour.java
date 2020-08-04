package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * Follow up: Could you solve it without loops/recursion?
 */
public class Problem04_PowerOfFour {

    /**
     * @param n - input number
     * @return true, if n is power of four, false, otherwise
     */
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        double i = Math.log(n) / Math.log(4);
        return i == Math.floor(i);
    }
}
