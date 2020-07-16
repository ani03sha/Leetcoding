package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Implement pow(x, n), which calculates x raised to the power n (x^n).
 * <p>
 * Note:
 * <p>
 * -100.0 < x < 100.0
 * n is a 32-bit signed integer, within the range [−2^31, 2^31 − 1]
 */
public class Problem16_Pow {

    /**
     * @param x - base
     * @param n - power
     * @return - x^n
     */
    public double calculate(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double temp = calculate(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return n > 0 ? x * temp * temp : (temp * temp) / x;
        }
    }
}
