package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * There are n servers numbered from 0 to n-1 connected by undirected server-to-server connections
 * forming a network where connections[i] = [a, b] represents a connection between servers a and b.
 * <p>
 * Any server can reach any other server directly or indirectly through the network.
 * <p>
 * A critical connection is a connection that, if removed, will make some server unable to reach
 * some other server.
 * <p>
 * Return all critical connections in the network in any order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 10^5
 * n-1 <= connections.length <= 10^5
 * connections[i][0] != connections[i][1]
 * There are no repeated connections.
 */
public class Problem24_CriticalConnectionsInANetwork {

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        // List to store the results
        List<List<Integer>> criticalConnections = new ArrayList<>();
        // Base case
        if (connections == null || connections.isEmpty()) {
            return criticalConnections;
        }
        // Create graph from connections
        Graph graph = new Graph(n);
        for (List<Integer> connection : connections) {
            graph.addConnection(connection.get(0), connection.get(1));
        }
        // Array to store timestamps of every node
        int[] timestamps = new int[n];
        // Run DFS from the 0-th node to find smallest timestamp
        // in all of its neighbors except the parent
        dfs(graph, timestamps, 0, -1, criticalConnections, 1);
        return criticalConnections;
    }

    private int dfs(Graph graph, int[] timestamps, int currentNode, int parent, List<List<Integer>> criticalConnections, int timestamp) {
        // If we have visited the node, then its
        // corresponding value in timestamps array
        // will be zero
        if (timestamps[currentNode] != 0) {
            return timestamps[currentNode];
        }
        // Update the current node's timestamp
        timestamps[currentNode] = timestamp++;
        // Find the node that can be reached with minimum timestamp
        int minimumTimestamp = Integer.MAX_VALUE;
        // Traverse through the neighbors of the node
        for (int neighbor : graph.adjacencyList[currentNode]) {
            // No need to check the parent
            if (neighbor == parent) {
                continue;
            }
            // Get neighbor's timestamp
            int neighborTimestamp = dfs(graph, timestamps, neighbor, currentNode, criticalConnections, timestamp);
            minimumTimestamp = Math.min(minimumTimestamp, neighborTimestamp);
        }
        // No Cycle
        if (minimumTimestamp >= timestamps[currentNode]) {
            if (parent >= 0) {
                criticalConnections.add(Arrays.asList(parent, currentNode));
            }
        }
        return Math.min(timestamps[currentNode], minimumTimestamp);

    }

    static class Graph {
        // Adjacency list
        Set<Integer>[] adjacencyList;

        @SuppressWarnings("unchecked")
        Graph(int vertices) {
            // Number of vertices/nodes
            adjacencyList = new HashSet[vertices];
            for (int i = 0; i < vertices; i++) {
                adjacencyList[i] = new HashSet<>();
            }
        }

        void addConnection(int u, int v) {
            adjacencyList[u].add(v);
            adjacencyList[v].add(u);
        }
    }
}
