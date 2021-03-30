package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi]
 * represents the width and the height of an envelope.
 * <p>
 * One envelope can fit into another if and only if both the width and height of
 * one envelope is greater than the width and height of the other envelope.
 * <p>
 * Return the maximum number of envelopes can you Russian doll (i.e., put one inside the other).
 * <p>
 * Note: You cannot rotate an envelope.
 * <p>
 * Constraints:
 * <p>
 * 1 <= envelopes.length <= 5000
 * envelopes[i].length == 2
 * 1 <= wi, hi <= 10^4
 */
public class Problem30_RussianDollEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {
        // Sort the array with height in increasing order and by
        // width in the decreasing order
        Arrays.sort(envelopes, Comparator.comparing((int[] a) -> a[0]).thenComparing((int[] a) -> a[1], Comparator.reverseOrder()));
        // List to store the valid envelopes
        List<Integer> validEnvelopes = new ArrayList<>();
        // Loop for all the envelopes
        for (int[] envelope : envelopes) {
            // Get the height of the envelope
            int currentHeight = envelope[1];
            // Check if the envelope is valid
            if (validEnvelopes.isEmpty() || currentHeight > validEnvelopes.get(validEnvelopes.size() - 1)) {
                validEnvelopes.add(currentHeight);
            } else {
                int left = 0;
                int right = validEnvelopes.size() - 1;
                while (left < right) {
                    // Middle index
                    int middle = left + (right - left) / 2;
                    if (currentHeight <= validEnvelopes.get(middle)) {
                        right = middle;
                    } else {
                        left = middle + 1;
                    }
                }
                validEnvelopes.set(right, currentHeight);
            }
        }
        return validEnvelopes.size();
    }
}
