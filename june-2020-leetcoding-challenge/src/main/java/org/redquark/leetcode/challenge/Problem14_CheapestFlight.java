package org.redquark.leetcode.challenge;

import java.util.*;

/**
 * @author Anirudh Sharma
 * <p>
 * There are n cities connected by m flights. Each flight starts from city u and arrives at v with
 * a price w.
 * <p>
 * Now given all the cities and flights, together with starting city src and the destination dst,
 * your task is to find the cheapest price from src to dst with up to k stops.
 * If there is no such route, output -1.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes n will be in range [1, 100], with nodes labeled from 0 to n - 1.
 * The size of flights will be in range [0, n * (n - 1) / 2].
 * The format of each flight will be (src, dst, price).
 * The price of each flight will be in the range [1, 10000].
 * k is in the range of [0, n - 1].
 * There will not be any duplicated flights or self cycles.
 */
public class Problem14_CheapestFlight {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // Adjacency list
        Map<Integer, Map<Integer, Integer>> adjacencyList = new HashMap<>();
        // Fill up the adjacency list
        for (int[] flight : flights) {
            if (!adjacencyList.containsKey(flight[0])) {
                adjacencyList.put(flight[0], new HashMap<>());
            }
            adjacencyList.get(flight[0]).put(flight[1], flight[2]);
        }
        // Priority queue for min heap
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        // Add src to the queue
        minHeap.add(new int[]{0, src, K + 1});
        // Loop until the condition holds
        while (!minHeap.isEmpty()) {
            int[] top = minHeap.remove();
            int price = top[0];
            int city = top[1];
            int stops = top[2];
            if (city == dst) {
                return price;
            }
            if (stops > 0) {
                Map<Integer, Integer> adj = adjacencyList.getOrDefault(city, new HashMap<>());
                for (int a : adj.keySet()) {
                    minHeap.add(new int[]{price + adj.get(a), a, stops - 1});
                }
            }
        }
        return -1;
    }
}
