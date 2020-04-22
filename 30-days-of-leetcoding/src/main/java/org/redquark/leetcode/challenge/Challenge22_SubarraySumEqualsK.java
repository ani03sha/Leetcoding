package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays
 * whose sum equals to k.
 * <p>
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
public class Challenge22_SubarraySumEqualsK {

    public int subarraySum(int[] numbers, int k) {
        // This counter will keep track of number of subarrays with sum k
        int count = 0;
        // This map will store the the pair of sum and its frequency
        Map<Integer, Integer> sumFrequency = new HashMap<>();
        // This will track sum so far
        int sum = 0;
        // Put initial value in the map
        sumFrequency.put(sum, 1);
        // Loop for the whole array
        for (int number : numbers) {
            sum += number;
            // If we have already seen the sum
            if (sumFrequency.containsKey(sum - k)) {
                count += sumFrequency.get(sum - k);
            }
            // Add the current sum and update its frequency
            sumFrequency.put(sum, sumFrequency.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
