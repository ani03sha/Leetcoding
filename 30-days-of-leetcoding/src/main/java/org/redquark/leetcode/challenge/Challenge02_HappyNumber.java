package org.redquark.leetcode.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number
 * equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 */
public class Challenge02_HappyNumber {

    /**
     * @param n - number to check if it is happy
     * @return - a boolean which determines if a number is happy or not
     * <p>
     * Algorithm:
     * 1. Base condition - return true if the number is 1
     * 2. Create a set that will store calculated squared values so far
     * 3. Add the given number to the set so that we can track in case it gets repeated
     * 4. Loop until the value is not repeated
     * 5. Check inside the loop if the squared value is not equal to one
     * 6. If it is not, then compute for further numbers
     * 7. If it is, then return true
     */
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        // Set that will store the already occurred values
        Set<Integer> values = new HashSet<>();
        // Add the given number to the set so that we get to know if it gets repeated
        values.add(n);
        // Calculate the squared values of digits of the given number
        int currentSquaredValue = findSquareValue(n);
        // Loop until the value is not repeated
        while (values.add(currentSquaredValue)) {
            // Check if the squared value is not equal to one
            if (currentSquaredValue != 1) {
                // Continue calculating squared values
                currentSquaredValue = findSquareValue(currentSquaredValue);
            } else {
                // If the value is one, break the loop and return
                return true;
            }
        }
        // If we reach here then it means the number is not happy
        return false;
    }

    /**
     * @param n - number for which squared value is to be calculated
     * @return - the squared value of its digits
     */
    private int findSquareValue(int n) {
        int squareValue = 0;
        while (n > 0) {
            squareValue += (int) Math.pow(n % 10, 2);
            n = n / 10;
        }
        return squareValue;
    }
}

