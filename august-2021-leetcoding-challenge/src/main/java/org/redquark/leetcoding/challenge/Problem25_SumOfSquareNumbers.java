package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-negative integer c, decide whether there are two integers a and b such that a^2 + b^2 = c.
 * <p>
 * Constraints:
 * <p>
 * 0 <= c <= 2^31 - 1
 */
public class Problem25_SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        // Special case
        if (c < 0) {
            return false;
        }
        // Left and right pointers
        int left = 0;
        int right = (int) Math.sqrt(c);
        // Loop until the pointers meet
        while (left <= right) {
            int sum = left * left + right * right;
            if (sum < c) {
                left++;
            } else if (sum > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}
