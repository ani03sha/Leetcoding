package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma (
 * <p>
 * Given a positive integer n, find the smallest integer which has exactly the same digits
 * existing in the integer n and is greater in value than n.
 * If no such positive integer exists, return -1.
 * <p>
 * Note that the returned integer should fit in 32-bit integer, if there is a valid answer
 * but it does not fit in 32-bit integer, return -1.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 2^31 - 1
 */
public class Problem23_NextGreaterElementIII {

    public int nextGreaterElement(int n) {
        // Convert the number into string and then to char array
        char[] numChars = String.valueOf(n).toCharArray();
        // Loop through the char array right to left
        for (int i = numChars.length - 2; i >= 0; i--) {
            // Current character
            char current = numChars[i];
            // Sort the array
            Arrays.sort(numChars, i + 1, numChars.length);
            for (int j = i + 1; j < numChars.length; j++) {
                if (numChars[j] > current) {
                    numChars[i] = numChars[j];
                    numChars[j] = current;
                    return Integer.parseInt(String.valueOf(numChars));
                }
            }
        }
        return -1;
    }
}
