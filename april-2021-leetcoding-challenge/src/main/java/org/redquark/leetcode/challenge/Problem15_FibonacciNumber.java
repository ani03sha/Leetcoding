package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1.
 * <p>
 * That is,
 * <p>
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * <p>
 * Given n, calculate F(n).
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 30
 */
public class Problem15_FibonacciNumber {

    public int fib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
