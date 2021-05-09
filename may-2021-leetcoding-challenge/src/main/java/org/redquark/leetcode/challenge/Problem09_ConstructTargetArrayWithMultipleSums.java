package org.redquark.leetcode.challenge;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers target. From a starting array, A consisting of all 1's,
 * you may perform the following procedure :
 * <p>
 * - let x be the sum of all elements currently in your array.
 * - choose index i, such that 0 <= i < target.size and set the value of A at index i to x.
 * - You may repeat this procedure as many times as needed.
 * <p>
 * Return True if it is possible to construct the target array from A otherwise return False.
 * <p>
 * Constraints:
 * <p>
 * N == target.length
 * 1 <= target.length <= 5 * 10^4
 * 1 <= target[i] <= 10^9
 */
public class Problem09_ConstructTargetArrayWithMultipleSums {

    public boolean isPossible(int[] target) {
        // Special case
        if (target == null || target.length == 0) {
            return false;
        }
        // Priority queue (max heap) to store items of array
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        // Cumulative sum of all the elements in the queue
        int cumulativeSum = 0;
        // Loop through every element in the array and store it in the heap
        for (int t : target) {
            maxHeap.add(t);
            cumulativeSum += t;
        }
        // Loop until the queue is empty
        while (maxHeap.peek() != null && maxHeap.peek() != 1) {
            // Get the root of the heap
            Integer root = maxHeap.poll();
            if (root != null) {
                // Subtract this from the cumulative sum
                cumulativeSum -= root;
                // Base case
                if (root <= cumulativeSum || cumulativeSum < 1) {
                    return false;
                }
                root %= cumulativeSum;
                cumulativeSum += root;
                maxHeap.add(root);
            }
        }
        return true;
    }
}
