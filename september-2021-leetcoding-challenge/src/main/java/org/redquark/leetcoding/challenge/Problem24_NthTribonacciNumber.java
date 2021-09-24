package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * The Tribonacci sequence Tn is defined as follows:
 * <p>
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * <p>
 * Given n, return the value of Tn.
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 37
 * The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
 */
public class Problem24_NthTribonacciNumber {

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int d = a + b + c;
        for (int i = 3; i <= n; i++) {
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
        return c;
    }
}
