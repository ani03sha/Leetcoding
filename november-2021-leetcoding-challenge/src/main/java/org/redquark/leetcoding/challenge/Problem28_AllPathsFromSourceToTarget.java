package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to
 * node n - 1 and return them in any order.
 * <p>
 * The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed
 * edge from node i to node graph[i][j]).
 * <p>
 * Constraints:
 * <p>
 * n == graph.length
 * 2 <= n <= 15
 * 0 <= graph[i][j] < n
 * graph[i][j] != i (i.e., there will be no self-loops).
 * All the elements of graph[i] are unique.
 * The input graph is guaranteed to be a DAG.
 */
public class Problem28_AllPathsFromSourceToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // List to store the output
        List<List<Integer>> paths = new ArrayList<>();
        // Special case
        if (graph == null || graph.length == 0) {
            return paths;
        }
        // List to store single path
        List<Integer> path = new ArrayList<>();
        // Add the first node to the list
        path.add(0);
        // Perform DFS
        dfs(graph, 0, path, paths);
        return paths;
    }

    private void dfs(int[][] graph, int index, List<Integer> path, List<List<Integer>> paths) {
        // If we are at the last node
        if (index == graph.length - 1) {
            paths.add(new ArrayList<>(path));
            return;
        }
        for (int node : graph[index]) {
            path.add(node);
            dfs(graph, node, path, paths);
            path.remove(path.size() - 1);
        }
    }
}
