package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 * <p>
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 * <p>
 * Constraints:
 * <p>
 * 10 <= low <= high <= 10^9
 */
public class Problem19_SequentialDigits {

    /**
     * @param low  - lower range
     * @param high - higher range
     * @return Sorted list of all the sequential numbers
     */
    public List<Integer> sequentialDigits(int low, int high) {
        // Resultant list
        List<Integer> result = new ArrayList<>();
        // Loop for the first digit
        for (int i = 1; i < 10; i++) {
            int x = i;
            for (int j = i + 1; j < 10; j++) {
                x *= 10;
                x += j;
                if (x >= low && x <= high) {
                    result.add(x);
                }
                if (x > high) {
                    break;
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
