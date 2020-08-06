package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others
 * appear once.
 * <p>
 * Find all the elements that appear twice in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime?
 */
public class Problem06_FindAllDuplicatesInArray {

    /**
     * @param numbers - input array
     * @return - list of elements which appear twice
     */
    public List<Integer> findDuplicates(int[] numbers) {
        // Resultant list
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            // Get the index
            int index = Math.abs(numbers[i]) - 1;
            if (numbers[index] > 0) {
                numbers[index] = -numbers[index];
            } else {
                result.add(index + 1);
            }
        }
        return result;
    }
}
