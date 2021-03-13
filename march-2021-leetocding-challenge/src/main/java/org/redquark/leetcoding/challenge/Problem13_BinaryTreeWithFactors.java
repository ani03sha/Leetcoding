package org.redquark.leetcoding.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of unique integers, arr, where each integer arr[i] is strictly greater than 1.
 * <p>
 * We make a binary tree using these integers, and each number may be used for any number of times.
 * Each non-leaf node's value should be equal to the product of the values of its children.
 * <p>
 * Return the number of binary trees we can make. The answer may be too large so return the answer
 * modulo 10^9 + 7.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 1000
 * 2 <= arr[i] <= 10^9
 */
public class Problem13_BinaryTreeWithFactors {

    public int numFactoredBinaryTrees(int[] arr) {
        // Total count of the binary trees
        long count = 0;
        long MOD = 1_000_000_007;
        // Sort the array
        Arrays.sort(arr);
        // DP lookup table with key as the integer
        // and value as the number of trees that can
        // be made with that integer as node
        Map<Integer, Long> lookup = new HashMap<>();
        // Bottom up for each integer
        for (int i = 0; i < arr.length; i++) {
            // Since every integer can be a tree with
            // only root present
            lookup.put(arr[i], 1L);
            // Check for every element less than the current one
            for (int j = 0; j < i; j++) {
                // Check if the factor is present and also present
                // in the lookup table
                if (arr[i] % arr[j] == 0 && lookup.containsKey(arr[i] / arr[j])) {
                    lookup.put(arr[i],
                            (lookup.get(arr[i]) + lookup.get(arr[j]) * lookup.get(arr[i] / arr[j])) % MOD);
                }
            }
        }
        for (long value : lookup.values()) {
            count = (count + value) % MOD;
        }
        return (int) count;
    }
}
