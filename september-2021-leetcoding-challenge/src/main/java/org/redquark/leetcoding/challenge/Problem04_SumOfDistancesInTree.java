package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.
 * <p>
 * You are given the integer n and the array edges where edges[i] = [ai, bi] indicates that there is an edge between
 * nodes ai and bi in the tree.
 * <p>
 * Return an array answer of length n where answer[i] is the sum of the distances between the ith node in the tree
 * and all other nodes.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 3 * 10^4
 * edges.length == n - 1
 * edges[i].length == 2
 * 0 <= ai, bi < n
 * ai != bi
 * The given input represents a valid tree.
 */
public class Problem04_SumOfDistancesInTree {

    @SuppressWarnings("unchecked")
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        // Special cases
        if (n == 1) {
            return new int[n];
        }
        if (n == 2) {
            return new int[]{1, 1};
        }
        // Adjacency list
        List<int[]>[] adjacencyList = new ArrayList[n];
        // Initialize the list
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        // Populate the adjacency list
        for (int[] edge : edges) {
            adjacencyList[edge[0]].add(new int[]{edge[1], 0, 0});
            adjacencyList[edge[1]].add(new int[]{edge[0], 0, 0});
        }
        // Array to store the final distances
        int[] distances = new int[n];
        // Array to mark if the node has been visited
        boolean[] visited = new boolean[n];
        // DFS for all nodes one by one
        for (int i = 0; i < n; i++) {
            distances[i] = dfs(adjacencyList, i, visited)[0];
        }
        return distances;
    }

    private int[] dfs(List<int[]>[] adjacencyList, int currentNode, boolean[] visited) {
        visited[currentNode] = true;
        int sum = 0;
        int count = 1;
        for (int[] adjacency : adjacencyList[currentNode]) {
            if (!visited[adjacency[0]]) {
                if (adjacency[1] == 0 && adjacency[2] == 0) {
                    int[] temp = dfs(adjacencyList, adjacency[0], visited);
                    adjacency[1] = temp[0];
                    adjacency[2] = temp[1];
                }
                sum += adjacency[1] + adjacency[2];
                count += adjacency[2];
            }
        }
        visited[currentNode] = false;
        return new int[]{sum, count};
    }
}
