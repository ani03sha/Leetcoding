package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A positive integer is magical if it is divisible by either a or b.
 * <p>
 * Given the three integers n, a, and b, return the nth magical number.
 * Since the answer may be very large, return it modulo 10^9 + 7.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 10^9
 * 2 <= a, b <= 4 * 10^4
 */
public class Problem11_NthMagicalNumber {

    public int nthMagicalNumber(int n, int a, int b) {
        final long modulus = (long) (1e9 + 7);
        long x = a;
        long y = b;
        // Left and right pointers
        long left = Math.min(a, b);
        long right = (long) n * Math.min(a, b);
        // Finding GCD
        while (y > 0) {
            long temp = x;
            x = y;
            y = temp % y;
        }
        long lcm = (long) a * b / x;
        while (left < right) {
            long middle = left + (right - left) / 2;
            if ((middle / a + middle / b - middle / lcm) < n) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return (int) (left % modulus);
    }
}
