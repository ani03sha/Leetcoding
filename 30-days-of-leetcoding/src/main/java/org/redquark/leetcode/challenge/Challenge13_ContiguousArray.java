package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 * <p>
 * Example 1:
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 * Example 2:
 * Input: [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * Note: The length of the given binary array will not exceed 50,000.
 */
public class Challenge13_ContiguousArray {

    /**
     * @param numbers - input binary array
     * @return - maximum length of the contiguous array
     * <p>
     * Algorithm:
     * 1. Replace all 0s with -1s
     * 2. Sum until the i'th index
     * 3. If the sum does not exist already put it in the map with the ending index
     * 4. If the sum exists, then update the maxLength with the new length if less
     */
    public int findMaxLength(int[] numbers) {
        // Map that will contain sum and the ending index
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        // Maximum length of subarray with equal number of 0s and 1s
        int maxLength = 0;
        // Initial sum
        int sum = 0;
        // Initialize map with the initial values
        sumIndexMap.put(sum, -1);
        // Loop through the entire array
        for (int i = 0; i < numbers.length; i++) {
            // If the element is zero them make it -1
            sum += numbers[i] == 0 ? -1 : 1;
            // Check if the sum is already present in the map
            if (sumIndexMap.containsKey(sum)) {
                // Update the maxLength and ending index
                if (maxLength < i - sumIndexMap.get(sum)) {
                    // Update the max length
                    maxLength = i - sumIndexMap.get(sum);
                }
            } else {
                // If the sum is not seen before then put it in the map
                sumIndexMap.put(sum, i);
            }
        }
        return maxLength;
    }
}
