package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer n, return the number of strings of length n that consist only
 * of vowels (a, e, i, o, u) and are lexicographically sorted.
 * <p>
 * A string s is lexicographically sorted if for all valid i, s[i] is the same as
 * or comes before s[i+1] in the alphabet.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 50
 */
public class Problem17_CountSortedVowelString {

    /**
     * @param n - number representing the length of each string
     * @return total number of sorted strings
     */
    public int countVowelStrings(int n) {
        // Array for storing values of previous state
        int[] dpPrevious = new int[5];
        // Array for storing values of current state
        int[] dpCurrent = new int[5];
        // Fill the previous array for initial state i.e. n = 1
        Arrays.fill(dpPrevious, 1);
        // Total count
        int count = 5;
        // Loop for the remaining combinations
        for (int i = 2; i <= n; i++) {
            int partial = 0;
            count = 0;
            for (int j = 0; j < dpPrevious.length; j++) {
                partial += dpPrevious[j];
                dpCurrent[j] = partial;
                count += dpCurrent[j];
                dpPrevious[j] = dpCurrent[j];
            }
        }
        return count;
    }
}
