package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers arr, you are initially positioned at the first index of the array.
 * <p>
 * In one step you can jump from index i to index:
 * <p>
 * i + 1 where: i + 1 < arr.length.
 * i - 1 where: i - 1 >= 0.
 * j where: arr[i] == arr[j] and i != j.
 * Return the minimum number of steps to reach the last index of the array.
 * <p>
 * Notice that you can not jump outside of the array at any time.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 5 * 10^4
 * -10^8 <= arr[i] <= 10^8
 */
public class Problem27_JumpGameIV {

    /**
     * @param arr - input array
     * @return - minimum number of steps to reach last index
     */
    public int minJumps(int[] arr) {
        // Base condition
        if (arr.length == 1) {
            return 0;
        }
        // Minimum number of steps to reach
        int jumps = 0;
        // Length of the array
        int n = arr.length;
        // Create a graph using map where key is the array element and value
        // is the list of indices at which that element is present
        Map<Integer, List<Integer>> graph = new HashMap<>();
        // Add values to the graph
        for (int i = 0; i < n; i++) {
            graph.computeIfAbsent(arr[i], x -> new ArrayList<>()).add(i);
        }
        // Queue to keep index, this will be used for BFS
        Queue<Integer> queue = new LinkedList<>();
        // Start from 0th index
        queue.offer(0);
        // Set to store if the element is already visited
        Set<Integer> visited = new HashSet<>();
        // Loop until the queue is empty
        while (!queue.isEmpty()) {
            // Current size of the queue
            int size = queue.size();
            while (size-- > 0) {
                // Current index
                int currentIndex = queue.poll();
                // Check if it is the last index
                if (currentIndex == n - 1) {
                    return jumps;
                }
                // Check three options to jump
                // 1. i + 1, if i + 1 is not visited
                if (currentIndex + 1 < n && visited.add(currentIndex + 1)) {
                    queue.offer(currentIndex + 1);
                }
                // 2. i - 1, if i - 1 is not visited
                if (currentIndex - 1 >= 0 && visited.add(currentIndex - 1)) {
                    queue.offer(currentIndex - 1);
                }
                // 3. Same value with different indices
                if (graph.containsKey(arr[currentIndex])) {
                    for (int index : graph.get(arr[currentIndex])) {
                        if (visited.add(index)) {
                            queue.offer(index);
                        }
                    }
                    // Already visited, remove from the map
                    graph.remove(arr[currentIndex]);
                }
            }
            jumps++;
        }
        return -1;
    }
}
