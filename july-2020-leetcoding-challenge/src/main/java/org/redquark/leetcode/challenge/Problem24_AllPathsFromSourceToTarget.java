package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a directed, acyclic graph of N nodes. Find all possible paths from node 0 to node N-1,
 * and return them in any order.
 * <p>
 * The graph is given as follows: the nodes are 0, 1, ..., graph.length - 1.  graph[i] is a list
 * of all nodes j for which the edge (i, j) exists.
 * <p>
 * Note:
 * <p>
 * The number of nodes in the graph will be in the range [2, 15].
 * You can print different paths in any order, but you should keep the order of nodes inside one path.
 */
public class Problem24_AllPathsFromSourceToTarget {

    // This list will store all the paths in the output
    List<List<Integer>> paths;
    // This list will store the individual paths
    List<Integer> path;

    /**
     * @param graph - input array representing graph
     * @return array of required paths
     */
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // Initializing both the lists
        paths = new ArrayList<>();
        path = new ArrayList<>();
        // Call DFS
        dfs(graph, 0);
        return paths;
    }

    private void dfs(int[][] graph, int current) {
        path.add(current);
        if (current == graph.length - 1) {
            paths.add(new ArrayList<>(path));
        } else {
            for (int node : graph[current]) {
                dfs(graph, node);
            }
        }
        path.remove(path.size() - 1);
    }
}
