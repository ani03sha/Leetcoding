package org.redquark.leetcode.challenge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums, choose a set of integers and remove all the occurrences of these integers in the array.
 * <p>
 * Return the minimum size of the set so that at least half of the integers of the array are removed.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 10^5
 * arr.length is even.
 * 1 <= arr[i] <= 10^5
 */
public class Problem06_ReduceArraySizeToTheHalf {

    public int minSetSize(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Map to store the frequencies of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Populate this map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Create a max heap based on frequency
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Store all the values in the heap
        maxHeap.addAll(frequencyMap.values());
        // Count of elements to be removed
        int count = 0;
        // Sum of frequencies
        int sum = 0;
        while (!maxHeap.isEmpty() && sum < n / 2) {
            sum += maxHeap.poll();
            count++;
        }
        return count;
    }
}
