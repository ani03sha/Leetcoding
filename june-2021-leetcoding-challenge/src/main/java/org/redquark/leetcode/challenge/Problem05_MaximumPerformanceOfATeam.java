package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given two integers n and k and two integer arrays speed and efficiency both of length n.
 * There are n engineers numbered from 1 to n. speed[i] and efficiency[i] represent the speed and efficiency
 * of the ith engineer respectively.
 * <p>
 * Choose at most k different engineers out of the n engineers to form a team with the maximum performance.
 * <p>
 * The performance of a team is the sum of their engineers' speeds multiplied by the minimum efficiency among
 * their engineers.
 * <p>
 * Return the maximum performance of this team. Since the answer can be a huge number, return it modulo 10^9 + 7.
 * <p>
 * Constraints:
 * <p>
 * 1 <= <= k <= n <= 10^5
 * speed.length == n
 * efficiency.length == n
 * 1 <= speed[i] <= 10^5
 * 1 <= efficiency[i] <= 10^8
 */
public class Problem05_MaximumPerformanceOfATeam {

    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        long MODULUS = (long) (1e9 + 7);
        // Lookup table to store tuple of efficiency and speed
        int[][] lookup = new int[n][2];
        // Populate this table
        for (int i = 0; i < n; i++) {
            lookup[i] = new int[]{efficiency[i], speed[i]};
        }
        // Sort the lookup table by efficiency
        Arrays.sort(lookup, (a, b) -> b[0] - a[0]);
        // Min Heap to store most k speedy engineers
        Queue<Integer> minHeap = new PriorityQueue<>(k, Comparator.comparingInt(a -> a));
        // Final performance
        long performance = 0;
        // Sum of speeds
        long sumOfSpeeds = 0;
        // Populate the heap
        for (int[] tuple : lookup) {
            minHeap.add(tuple[1]);
            sumOfSpeeds += tuple[1];
            if (minHeap.size() > k) {
                if (minHeap.peek() != null) {
                    sumOfSpeeds -= minHeap.poll();
                }
            }
            performance = Math.max(performance, sumOfSpeeds * tuple[0]);
        }
        return (int) (performance % MODULUS);
    }
}
