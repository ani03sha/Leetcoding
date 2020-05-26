package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 */
public class Problem26_ContiguousArray {

    /**
     * @param numbers - input array
     * @return - length of longest contiguous array
     */
    public int findMaxLength(int[] numbers) {
        // Map that will contain sum and the ending index
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        // Maximum length of subarray with equal number of 0s and 1s
        int maxLength = 0;
        // Initial ending index
        int endingIndex = -1;
        // Initial sum
        int sum = 0;
        // Initialize map with the initial values
        sumIndexMap.put(sum, endingIndex);
        // Loop through the entire array
        for (int i = 0; i < numbers.length; i++) {
            // If the element is zero them make it -1
            sum += numbers[i] == 0 ? -1 : 1;
            // Check if the sum is already present in the map
            if (sumIndexMap.containsKey(sum)) {
                // Update the maxLength and ending index
                if (maxLength < i - sumIndexMap.get(sum)) {
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
