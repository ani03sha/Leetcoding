package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * We define a harmonious array as an array where the difference between its maximum value and
 * its minimum value is exactly 1.
 * <p>
 * Given an integer array nums, return the length of its longest harmonious subsequence among
 * all its possible subsequences.
 * <p>
 * A subsequence of array is a sequence that can be derived from the array by deleting some or
 * no elements without changing the order of the remaining elements.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 10^4
 * -10^9 <= nums[i] <= 10^9
 */
public class Problem04_LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        // Special case
        if (nums == null || nums.length < 2) {
            return 0;
        }
        // Map to store the count of the elements
        Map<Integer, Integer> countMap = new HashMap<>();
        // Loop for every element in the array
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        // Longest length for harmonious subsequence
        int longestLength = 0;
        // Loop over map for every key
        for (int key : countMap.keySet()) {
            if (countMap.containsKey(key + 1)) {
                longestLength = Math.max(longestLength, countMap.get(key) + countMap.get(key + 1));
            }
        }
        return longestLength;
    }
}
