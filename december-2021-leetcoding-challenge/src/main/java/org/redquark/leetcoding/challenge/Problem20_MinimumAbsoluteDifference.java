package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference
 * of any two elements.
 * <p>
 * Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
 * <p>
 * a, b are from arr
 * a < b
 * b - a equals to the minimum absolute difference of any two elements in arr
 * <p>
 * Constraints:
 * <p>
 * 2 <= arr.length <= 10^5
 * -10^6 <= arr[i] <= 10^6
 */
public class Problem20_MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // List to store all the pairs
        List<List<Integer>> pairs = new ArrayList<>();
        // Special case
        if (arr == null || arr.length == 0) {
            return pairs;
        }
        // Sort the array
        Arrays.sort(arr);
        // Variable to store the minimum absolute different
        int mad = Integer.MAX_VALUE;
        // Loop through the array
        for (int i = 1; i < arr.length; i++) {
            if (mad == arr[i] - arr[i - 1]) {
                pairs.add(Arrays.asList(arr[i - 1], arr[i]));
            } else if (mad > arr[i] - arr[i - 1]) {
                pairs.clear();
                mad = arr[i] - arr[i - 1];
                pairs.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return pairs;
    }
}