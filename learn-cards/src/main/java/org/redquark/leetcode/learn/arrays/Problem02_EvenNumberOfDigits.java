package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class Problem02_EvenNumberOfDigits {

    /**
     * @param numbers - input array
     * @return - count of elements having even number of digits
     * <p>
     * Algorithm:
     * 1. Find Log10 for each element to get the number of digits in it
     * 2. Increment the count if there are even digits
     */
    public int findNumbers(int[] numbers) {
        // Count of elements with even digits
        int count = 0;
        // Loop through the entire array
        for (int n : numbers) {
            // Check if the number of digits in the element is even
            if (((int) Math.log10(n) + 1) % 2 == 0) {
                // Increment the count
                count++;
            }
        }
        return count;
    }
}
