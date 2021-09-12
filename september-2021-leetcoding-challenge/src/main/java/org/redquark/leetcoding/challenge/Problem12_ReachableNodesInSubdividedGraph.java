package org.redquark.leetcoding.challenge;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an undirected graph (the "original graph") with n nodes labeled from 0 to n - 1.
 * You decide to subdivide each edge in the graph into a chain of nodes, with the number of new nodes
 * varying between each edge.
 * <p>
 * The graph is given as a 2D array of edges where edges[i] = [ui, vi, cnti] indicates that there is an
 * edge between nodes ui and vi in the original graph, and cnti is the total number of new nodes that you
 * will subdivide the edge into. Note that cnti == 0 means you will not subdivide the edge.
 * <p>
 * To subdivide the edge [ui, vi], replace it with (cnti + 1) new edges and cnti new nodes.
 * The new nodes are x1, x2, ..., xcnti, and the new edges are [ui, x1], [x1, x2], [x2, x3], ..., [xcnti+1, xcnti],
 * [xcnti, vi].
 * <p>
 * In this new graph, you want to know how many nodes are reachable from the node 0, where a node is reachable
 * if the distance is maxMoves or less.
 * <p>
 * Given the original graph and maxMoves, return the number of nodes that are reachable from node 0 in the new graph.
 * <p>
 * Constraints:
 * <p>
 * 0 <= edges.length <= min(n * (n - 1) / 2, 10^4)
 * edges[i].length == 3
 * 0 <= ui < vi < n
 * There are no multiple edges in the graph.
 * 0 <= cnti <= 10^4
 * 0 <= maxMoves <= 10^9
 * 1 <= n <= 3000
 */
public class Problem12_ReachableNodesInSubdividedGraph {

    public int reachableNodes(int[][] edges, int maxMoves, int n) {
        // Final count
        int count = 0;
        // Special case
        if (edges == null || edges.length == 0) {
            return count;
        }
        // Matrix to store the values between two nodes in a graph
        int[][] graph = new int[n][n];
        // Populate the graph with default values
        Arrays.stream(graph).forEach(a -> Arrays.fill(a, -1));
        // Now populate the graph from the given edges
        for (int[] edge : edges) {
            graph[edge[0]][edge[1]] = edge[2];
            graph[edge[1]][edge[0]] = edge[2];
        }
        // Boolean array to mark the visited nodes
        boolean[] visited = new boolean[n];
        // Max heap based on max moves possible
        Queue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        // Add initial value in the heap
        maxHeap.add(new int[]{0, maxMoves});
        // Loop until the heaps is empty
        while (!maxHeap.isEmpty()) {
            // Get the nearest node
            int[] nearest = maxHeap.poll();
            // Nearest node id
            int nearestNodeId = nearest[0];
            // Remaining max moves
            int remainingMaxMoves = nearest[1];
            // If the node is already visited, skip it
            if (visited[nearestNodeId]) {
                continue;
            }
            // Mark this node as visited
            visited[nearestNodeId] = true;
            // Update the count
            count++;
            // Loop for all the neigbors
            for (int neighbor = 0; neighbor < n; neighbor++) {
                // If there is a connection between the nodes
                if (graph[nearestNodeId][neighbor] != -1) {
                    if (!visited[neighbor] && remainingMaxMoves >= graph[nearestNodeId][neighbor] + 1) {
                        maxHeap.add(new int[]{neighbor, remainingMaxMoves - graph[nearestNodeId][neighbor] - 1});
                    }
                    // Cost of move
                    int moveCost = Math.min(remainingMaxMoves, graph[nearestNodeId][neighbor]);
                    graph[nearestNodeId][neighbor] -= moveCost;
                    graph[neighbor][nearestNodeId] -= moveCost;
                    count += moveCost;
                }
            }
        }
        return count;
    }
}
