package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an undirected graph, return true if and only if it is bipartite.
 * <p>
 * Recall that a graph is bipartite if we can split its set of nodes into two independent
 * subsets A and B, such that every edge in the graph has one node in A and another node in B.
 * <p>
 * The graph is given in the following form: graph[i] is a list of indexes j for which
 * the edge between nodes i and j exists. Each node is an integer between 0 and graph.length - 1.
 * <p>
 * There are no self edges or parallel edges: graph[i] does not contain i, and it
 * doesn't contain any element twice.
 * <p>
 * Constraints:
 * <p>
 * 1 <= graph.length <= 100
 * 0 <= graph[i].length < 100
 * 0 <= graph[i][j] <= graph.length - 1
 * graph[i][j] != i
 * All the values of graph[i] are unique.
 * The graph is guaranteed to be undirected.
 */
public class Problem14_IsGraphBipartite {

    public boolean isBipartite(int[][] graph) {
        // Our goal is trying to use two colors to color the graph
        // and see if there are any adjacent nodes having the same color.
        int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == 0 && validColor(graph, colors, 1, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean validColor(int[][] graph, int[] colors, int color, int node) {
        if (colors[node] != 0) {
            return colors[node] != color;
        }
        colors[node] = color;
        for (int next : graph[node]) {
            if (validColor(graph, colors, -color, next)) {
                return true;
            }
        }
        return false;
    }
}
