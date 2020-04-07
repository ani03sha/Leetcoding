package org.redquark.leetcode.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * If there're duplicates in arr, count them seperately.
 */
public class Challenge07_CountingElements {

    /**
     * @param arr - array to be inspected
     * @return - count of valid elements
     * <p>
     * Algorithm:
     * 1. Add all elements in a set
     * 2. Check if i+1 exist in that set
     */
    public int countElements(int[] arr) {
        // Set that will store all the elements of the array
        Set<Integer> elements = new HashSet<>();
        // Variable that will count the valid elements
        int count = 0;
        // Add each array element to the set
        for (int value : arr) {
            elements.add(value);
        }
        // Loop for each element in the array and check if i+1 exist in the set
        for (Integer i : arr) {
            if (elements.contains(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
