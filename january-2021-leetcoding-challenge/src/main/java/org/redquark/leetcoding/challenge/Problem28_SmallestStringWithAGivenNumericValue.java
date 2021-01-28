package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * The numeric value of a lowercase character is defined as its position (1-indexed)
 * in the alphabet, so the numeric value of a is 1, the numeric value of b is 2,
 * the numeric value of c is 3, and so on.
 * <p>
 * The numeric value of a string consisting of lowercase characters is defined as
 * the sum of its characters' numeric values. For example, the numeric value of
 * the string "abe" is equal to 1 + 2 + 5 = 8.
 * <p>
 * You are given two integers n and k. Return the lexicographically smallest string
 * with length equal to n and numeric value equal to k.
 * <p>
 * Note that a string x is lexicographically smaller than string y if x comes before y
 * in dictionary order, that is, either x is a prefix of y, or if i is the first
 * position such that x[i] != y[i], then x[i] comes before y[i] in alphabetic order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 10^5
 * n <= k <= 26 * n
 */
public class Problem28_SmallestStringWithAGivenNumericValue {

    public String getSmallestString(int n, int k) {
        // Character array of resultant string
        char[] characters = new char[n];
        // Fill the array with 'a's.
        Arrays.fill(characters, 'a');
        // Reduce the value of k by n
        k -= n;
        // Variable to store the current index
        int index = characters.length - 1;
        // Loop until the value of k is greater than
        // or equal to 26
        while (k >= 26) {
            // Start adding z from the right
            characters[index] = 'z';
            // Reduce k by 25 ('z' - 'a' => 25)
            k -= 25;
            index--;
        }
        // For the remaining k
        characters[index] = (char) (k + 'a');
        return String.valueOf(characters);
    }
}
