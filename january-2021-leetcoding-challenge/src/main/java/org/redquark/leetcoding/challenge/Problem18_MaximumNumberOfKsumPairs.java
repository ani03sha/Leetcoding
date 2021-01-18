package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array nums and an integer k.
 * <p>
 * In one operation, you can pick two numbers from the array whose sum equals k and
 * remove them from the array.
 * <p>
 * Return the maximum number of operations you can perform on the array.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^9
 * 1 <= k <= 10^9
 */
public class Problem18_MaximumNumberOfKsumPairs {

    /**
     * @param nums - array of numbers
     * @param k    - given sum
     * @return number of pairs with sum k
     */
    public int maxOperations(int[] nums, int k) {
        // Total number of pairs
        int pairs = 0;
        // Base condition
        if (nums.length <= 1) {
            return pairs;
        }
        // Map to store the value and its frequency
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Loop for the entire array and store only those
        // values which are less than k.
        for (int num : nums) {
            if (num < k) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }
        // Loop for the map values
        for (int key : frequencyMap.keySet()) {
            pairs += Math.min(frequencyMap.getOrDefault(key, 0),
                    frequencyMap.getOrDefault(k - key, 0));
        }
        return pairs / 2;
    }
}
