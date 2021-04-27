package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * <p>
 * An integer n is a power of three, if there exists an integer x such that n == 3^x.
 * <p>
 * Constraints:
 * <p>
 * -2^31 <= n <= 2^31 - 1
 * <p>
 * Follow up: Could you solve it without loops/recursion?
 */
public class Problem27_PowerOfThree {

    public boolean isPowerOfThree(int n) {
        // Base case
        if (n <= 0) {
            return false;
        }
        return Math.pow(3, 19) % n == 0;
    }
}
