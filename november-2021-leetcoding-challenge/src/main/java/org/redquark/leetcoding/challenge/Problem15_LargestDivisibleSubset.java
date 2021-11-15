package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i],
 * answer[j]) of elements in this subset satisfies:
 * <p>
 * answer[i] % answer[j] == 0, or
 * answer[j] % answer[i] == 0
 * If there are multiple solutions, return any of them.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 2 * 10^9
 * All the integers in nums are unique.
 */
public class Problem15_LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        // List to store the largest divisible subset
        List<Integer> output = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return output;
        }
        // Sort the array so that the bigger multiples come after the number
        // of which we need to find the multiples of
        Arrays.sort(nums);
        // Length of the array
        int n = nums.length;
        // Array to store the indices of the next multiples
        int[] nextIndices = new int[n];
        // At the beginning, there is no multiple found, so default value would be -1
        Arrays.fill(nextIndices, -1);
        // Array to store the sizes of the largest divisible subset until the current index
        int[] sizes = new int[n];
        // Fill the array with default value of 1 because in any case the element itself
        // will be included
        Arrays.fill(sizes, 1);
        // Global maximum length
        int globalMaximum = 1;
        // Index at which the largest subset is found
        int globalIndex = 0;
        // Loop through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Local maximum length
            int localMaximum = 0;
            // Local index at which the largest divisible subset is found
            int localIndex = i;
            // Check the factors of current element to its right
            int j = i + 1;
            // Loop until the end of the array
            while (j < n) {
                // Check for the required conditions
                if (nums[j] % nums[i] == 0 && sizes[j] > localMaximum) {
                    localMaximum = sizes[j];
                    localIndex = j;
                }
                j++;
            }
            // If the local index has changed
            if (localIndex != i) {
                sizes[i] += sizes[localIndex];
                nextIndices[i] = localIndex;
                if (localMaximum + 1 > globalMaximum) {
                    globalMaximum = localMaximum + 1;
                    globalIndex = i;
                }
            }
        }
        // Populate the output list
        int i = globalIndex;
        while (i >= 0) {
            output.add(nums[i]);
            i = nextIndices[i];
        }
        return output;
    }
}
