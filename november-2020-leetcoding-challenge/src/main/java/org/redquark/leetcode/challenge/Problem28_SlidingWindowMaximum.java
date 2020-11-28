package org.redquark.leetcode.challenge;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array of integers nums, there is a sliding window of size k which is moving
 * from the very left of the array to the very right. You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 * <p>
 * Return the max sliding window.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * 1 <= k <= nums.length
 */
public class Problem28_SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // Base condition
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        // Deque
        Deque<Integer> deque = new LinkedList<>();
        // Resultant array
        int[] result = new int[nums.length - k + 1];
        // Loop for elements in the array
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.getLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
            // Remove if size of deque is greater than k
            if (i - deque.getFirst() + 1 > k) {
                deque.removeFirst();
            }
            // Add into the result
            if (i + 1 >= k) {
                result[i + 1 - k] = nums[deque.getFirst()];
            }
        }
        return result;
    }
}
