package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * <p>
 * Note: The algorithm should run in linear time and in O(1) space.
 */
public class Problem22_MajorityElementII {

    public List<Integer> majorityElement(int[] numbers) {
        // Resultant list
        List<Integer> result = new ArrayList<>();
        // Base condition
        if (numbers == null || numbers.length == 0) {
            return result;
        }
        if (numbers.length == 1) {
            result.add(numbers[0]);
            return result;
        }
        // Candidates
        int candidate1 = numbers[0];
        int candidate2 = 0;
        // Counter for two candidates
        int c1 = 1;
        int c2 = 0;
        // Loop for the remaining elements
        for (int i = 1; i < numbers.length; i++) {
            // Current element
            int currentElement = numbers[i];
            if (candidate1 == currentElement) {
                c1++;
            } else if (candidate2 == currentElement) {
                c2++;
            } else if (c1 == 0) {
                candidate1 = currentElement;
                c1 = 1;
            } else if (c2 == 0) {
                candidate2 = currentElement;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int n : numbers) {
            if (n == candidate1) {
                c1++;
            } else if (n == candidate2) {
                c2++;
            }
        }
        if (c1 > numbers.length / 3) {
            result.add(candidate1);
        }
        if (c2 > numbers.length / 3) {
            result.add(candidate2);
        }
        return result;
    }
}
