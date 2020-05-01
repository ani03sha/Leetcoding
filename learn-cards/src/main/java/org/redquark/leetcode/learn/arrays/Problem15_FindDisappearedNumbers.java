package org.redquark.leetcode.learn.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * <p>
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
public class Problem15_FindDisappearedNumbers {

    /**
     * @param numbers - input array
     * @return - list of missing numbers
     * <p>
     * Algorithm:
     * 1. Iterate through the array and mark elements at index equal to the current element's value as negative
     * 2. Loop through the array and if the current element is positive then add it to the list
     */
    public List<Integer> findDisappearedNumbers(int[] numbers) {
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int value = Math.abs(numbers[i]) - 1;
            if (numbers[value] > 0) {
                numbers[value] = -numbers[value];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                missingNumbers.add(i + 1);
            }
        }
        return missingNumbers;
    }
}
