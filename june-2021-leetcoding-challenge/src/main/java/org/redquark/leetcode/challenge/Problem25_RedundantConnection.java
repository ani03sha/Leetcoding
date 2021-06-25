package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * In this problem, a tree is an undirected graph that is connected and has no cycles.
 * <p>
 * You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added.
 * The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed.
 * The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is
 * an edge between nodes ai and bi in the graph.
 * <p>
 * Return an edge that can be removed so that the resulting graph is a tree of n nodes.
 * If there are multiple answers, return the answer that occurs last in the input.
 * <p>
 * Constraints:
 * <p>
 * n == edges.length
 * 3 <= n <= 1000
 * edges[i].length == 2
 * 1 <= ai < bi <= edges.length
 * ai != bi
 * There are no repeated edges.
 * The given graph is connected.
 */
public class Problem25_RedundantConnection {

    public int[] findRedundantConnection(int[][] edges) {
        // Length of the edges
        int n = edges.length;
        // Lookup table
        int[] lookup = new int[2 * n + 1];
        // Populate the table for no cycles
        for (int i = 0; i < lookup.length; i++) {
            lookup[i] = i;
        }
        // Traverse for all the edges
        for (int[] edge : edges) {
            int f = edge[0];
            int t = edge[1];
            if (find(lookup, f) == find(lookup, t)) {
                return edge;
            } else {
                lookup[find(lookup, f)] = find(lookup, t);
            }
        }
        return new int[2];
    }

    private int find(int[] lookup, int f) {
        if (lookup[f] != f) {
            lookup[f] = find(lookup, lookup[f]);
        }
        return lookup[f];
    }
}
