package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 5 * 10^6
 */
public class Problem10_CountPrimes {

    public int countPrimes(int n) {
        // Boolean array to mark of numbers that are not prime
        boolean[] primes = new boolean[n];
        // Fill this array with true, i.e., we are assuming every
        // number is a prime number except 0 and 1
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }
        // Mark off all the composite numbers as false
        for (int i = 2; i * i < n; i++) {
            if (!primes[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                primes[j] = false;
            }
        }
        // Count of prime numbers
        int count = 0;
        // At this point, all indices with true value are prime numbers
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return count;
    }
}
