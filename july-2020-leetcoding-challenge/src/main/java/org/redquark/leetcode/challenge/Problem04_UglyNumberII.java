package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Write a program to find the n-th ugly number.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * <p>
 * Note:
 * <p>
 * 1 is typically treated as an ugly number.
 * n does not exceed 1690.
 */
public class Problem04_UglyNumberII {

    /**
     * @param n value of n
     * @return n-th ugly number
     */
    public int nthUglyNumber(int n) {
        // This array will store ugly numbers
        int[] ugly = new int[n];
        // Array index variable that will store multiples of two
        int i2 = 0;
        // Array index variable that will store multiples of three
        int i3 = 0;
        // Array index variable that will store multiples of five
        int i5 = 0;
        // Next multiple of two
        int nextMultipleOfTwo = 2;
        // Next multiple of three
        int nextMultipleOfThree = 3;
        // Next multiple of five
        int nextMultipleOfFive = 5;
        // Next ugly number
        int nextUglyNumber = 1;
        // The first ugly number will always be 1
        ugly[0] = 1;
        // Loop until n
        for (int i = 1; i < n; i++) {
            // Next ugly number will be the minimum of multiples of two, three and five
            nextUglyNumber = Math.min(nextMultipleOfTwo, Math.min(nextMultipleOfThree, nextMultipleOfFive));
            // Update current ugly number
            ugly[i] = nextUglyNumber;
            // Check if next ugly number is multiple of two
            if (nextUglyNumber == nextMultipleOfTwo) {
                // Increment count of multiple of two's index
                i2++;
                // Update next multiple of two
                nextMultipleOfTwo = ugly[i2] * 2;
            }
            // Check if next ugly number is multiple of three
            if (nextUglyNumber == nextMultipleOfThree) {
                // Increment count of multiple of three's index
                i3++;
                // Update next multiple of two
                nextMultipleOfThree = ugly[i3] * 3;
            }
            // Check if next ugly number is multiple of two
            if (nextUglyNumber == nextMultipleOfFive) {
                // Increment count of multiple of five's index
                i5++;
                // Update next multiple of two
                nextMultipleOfFive = ugly[i5] * 5;
            }
        }
        return nextUglyNumber;
    }
}
