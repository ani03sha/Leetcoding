package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * <p>
 * Note: Do not use any built-in library function such as sqrt.
 */
public class Problem09_ValidPerfectSquare {

    /**
     * @param n - number to check
     * @return true, if a perfect square
     * <p>
     * Algorithm: Binary search technique
     */
    public boolean isPerfectSquare(int n) {
        // Base condition
        if (n < 2) {
            return true;
        }
        // Now, we will implement binary search technique
        long low = 2;
        long high = n / 2;
        // Loop until low is less than high
        while (low <= high) {
            // Middle of the range
            long mid = low + (high - low) / 2;
            if (mid * mid == n) {
                return true;
            } else if (mid * mid < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
