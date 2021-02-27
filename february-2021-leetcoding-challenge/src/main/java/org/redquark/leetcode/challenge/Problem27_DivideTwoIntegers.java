package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two integers dividend and divisor, divide two integers without using multiplication,
 * division, and mod operator.
 * <p>
 * Return the quotient after dividing dividend by divisor.
 * <p>
 * The integer division should truncate toward zero, which means losing its fractional part.
 * For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.
 * <p>
 * Note:
 * <p>
 * Assume we are dealing with an environment that could only store integers within the
 * 32-bit signed integer range: [−2^31,  2^31 − 1].
 * <p>
 * For this problem, assume that your function returns 2^31 − 1 when the division result overflows.
 * <p>
 * Constraints:
 * <p>
 * -2^31 <= dividend, divisor <= 2^31 - 1
 * divisor != 0
 */
public class Problem27_DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        // Check for overflow
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        // Sign of the quotient
        boolean sign = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0);
        // Quotient value
        int quotient = 0;
        // Take the absolute values
        long absoluteDividend = Math.abs((long) dividend);
        long absoluteDivisor = Math.abs((long) divisor);
        // Loop until the  dividend is greater than or
        // equal to the divisor
        while (absoluteDividend >= absoluteDivisor) {
            // This represents the number of bits shifted or
            // how many times we can double the number
            int shift = 0;
            while (absoluteDividend >= (absoluteDivisor << shift)) {
                shift++;
            }
            // Add the number of times we shifted to the quotient
            quotient += (1 << (shift - 1));
            // Update the dividend for the next iteration
            absoluteDividend -= absoluteDivisor << (shift - 1);
        }
        return sign ? quotient : -quotient;
    }
}
