package org.redquark.leetcode.challenge;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * We have a collection of stones, each stone has a positive integer weight.
 * <p>
 * Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y
 * with x <= y.  The result of this smash is:
 * <p>
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
 * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 */
public class Challenge12_LastStoneWeight {

    /**
     * @param stones - array of stones' weights
     * @return weight of last stone, if remains
     * <p>
     * Algorithm:
     * 1. Add all weights into the max heap
     * 2. Remove the two heaviest stones
     * 3. Find the difference between the two
     * 4. Add that difference to the heap (if not zero)
     * 5. Return the weight of the last stone
     */
    public int lastStoneWeight(int[] stones) {
        // Create a heap to store all array elements
        Queue<Integer> maxHeap = new PriorityQueue<>();
        // Add each element in the heap
        for (int stone : stones) {
            // Since default heap in java is min heap, we will add the negative values to make it the max heap
            maxHeap.add(-stone);
        }
        // Loop until we have only one stone remaining in the heap
        while (maxHeap.size() > 1) {
            // Get weights of two heaviest stones
            int stoneOne = -maxHeap.remove();
            int stoneTwo = -maxHeap.remove();
            // Check if the weights are not equal
            if (stoneOne != stoneTwo) {
                maxHeap.add(-(stoneOne - stoneTwo));
            }
        }
        // Return the appropriate value
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }
}
