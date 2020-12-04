package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two positive integers n and k.
 * <p>
 * A factor of an integer n is defined as an integer i where n % i == 0.
 * <p>
 * Consider a list of all factors of n sorted in ascending order, return the kth factor in this
 * list or return -1 if n has less than k factors.
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= n <= 1000
 */
public class Problem04_TheKthFactorOfN {

    /**
     * @param n - n
     * @param k - k
     * @return - kth factor
     */
    public int kthFactor(int n, int k) {
        // Base condition
        if (n <= 1) {
            return n;
        }
        // Number of factors
        int count = 0;
        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // If i is a factor then we will increment the count
            if (n % i == 0) {
                count++;
            }
            // If the count == k then that's it. We have found our answer
            if (count == k) {
                return i;
            }
        }
        return -1;
    }
}
