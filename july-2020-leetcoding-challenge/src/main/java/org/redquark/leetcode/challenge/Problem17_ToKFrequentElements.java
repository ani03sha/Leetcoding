package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty array of integers, return the k most frequent elements
 * <p>
 * Note:
 * <p>
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 * It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
 * You can return the answer in any order.
 */
public class Problem17_ToKFrequentElements {

    /**
     * @param numbers - input array of numbers
     * @param k       - input k
     * @return - array containing k largest elements
     */
    public int[] topKFrequent(int[] numbers, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : numbers) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        maxHeap.addAll(frequencyMap.keySet());
        int[] result = new int[k];
        int index = 0;
        while (k > 0) {
            result[index] = maxHeap.remove();
            k--;
            index++;
        }
        return result;
    }
}

