package org.redquark.leetcode.challenge;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a 0-indexed integer array nums and an integer k.
 * <p>
 * You are initially standing at index 0. In one move, you can jump at most k steps forward without
 * going outside the boundaries of the array. That is, you can jump from index i to any index in the
 * range [i + 1, min(n - 1, i + k)] inclusive.
 * <p>
 * You want to reach the last index of the array (index n - 1). Your score is the sum of all nums[j]
 * for each index j you visited in the array.
 * <p>
 * Return the maximum score you can get.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length, k <= 10^5
 * -10^4 <= nums[i] <= 10^4
 */
public class Problem09_JumpGameVI {

    public int maxResult(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Create a max heap to store score and index
        // based on score
        Queue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        // Add the first tuple of score and index
        maxHeap.offer(new int[]{nums[0], 0});
        // Maximum score
        int maxScore = nums[0];
        // Loop through the remaining elements
        for (int i = 1; i < nums.length; i++) {
            while (maxHeap.peek() != null && maxHeap.peek()[1] < i - k) {
                maxHeap.poll();
            }
            // Current tuple
            int[] current = maxHeap.peek();
            if (current != null) {
                maxScore = current[0] + nums[i];
            }
            maxHeap.offer(new int[]{maxScore, i});
        }
        return maxScore;
    }
}
