package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj)
 * of elements in this subset satisfies:
 * <p>
 * Si % Sj = 0 or Sj % Si = 0.
 * <p>
 * If there are multiple solutions, return any subset is fine.
 */
public class Problem13_LargestDivisibleSubset {

    /**
     * @param numbers - input array
     * @return list of items that are in largest divisible subset
     */
    public List<Integer> largestDivisibleSubset(int[] numbers) {
        // Length of the array
        int n = numbers.length;
        // Resultant list
        List<Integer> result = new ArrayList<>();
        // Base condition
        if (n == 0) {
            return result;
        }
        // Sort the array
        Arrays.sort(numbers);
        // Array that will keep track of next indices
        int[] nextIndices = new int[n];
        // Array that contains sizes of subsets
        int[] sizes = new int[n];
        // Initially all next indices for each element will be invalid or -1
        Arrays.fill(nextIndices, -1);
        // Initially all sizes will be 1
        Arrays.fill(sizes, 1);
        // Global maximum
        int maxLength = 1;
        // Maximum index
        int maxIndex = 0;
        // Loop from right to left
        for (int i = n - 1; i >= 0; i--) {
            int j = i + 1;
            // Local maximum for index i
            int max = 0;
            // Local index
            int index = i;
            // Loop for the remaining elements for index i
            while (j < n) {
                // Check for the condition for the modulus
                if (numbers[j] % numbers[i] == 0 && sizes[j] > max) {
                    max = sizes[j];
                    index = j;
                }
                j++;
            }
            if (index != i) {
                sizes[i] += sizes[index];
                nextIndices[i] = index;
                if (max + 1 > maxLength) {
                    maxLength = max + 1;
                    maxIndex = i;
                }
            }
        }
        int current = maxIndex;
        while (current >= 0) {
            result.add(numbers[current]);
            current = nextIndices[current];
        }
        return result;
    }
}
