package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * A tree is an undirected graph in which any two vertices are connected by exactly one path.
 * In other words, any connected graph without simple cycles is a tree.
 * <p>
 * Given a tree of n nodes labelled from 0 to n - 1, and an array of n - 1 edges where edges[i] = [ai, bi]
 * indicates that there is an undirected edge between the two nodes ai and bi in the tree, you can choose
 * any node of the tree as the root. When you select a node x as the root, the result tree has height h.
 * <p>
 * Among all possible rooted trees, those with minimum height (i.e. min(h)) are called minimum height
 * trees (MHTs).
 * <p>
 * Return a list of all MHTs' root labels. You can return the answer in any order.
 * <p>
 * The height of a rooted tree is the number of edges on the longest downward path between the root and
 * a leaf.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 2 * 10^4
 * edges.length == n - 1
 * 0 <= ai, bi < n
 * ai != bi
 * All the pairs (ai, bi) are distinct.
 * The given input is guaranteed to be a tree and there will be no repeated edges.
 */
public class Problem04_MinimumHeightTrees {

    /**
     * @param n     - number of nodes
     * @param edges - edge array
     * @return list of roots of MHTs
     */
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // Resultant list
        List<Integer> result = new ArrayList<>();
        // Base conditions
        if (n <= 0) {
            return result;
        }
        // Single node and no edge at all
        if (n == 1 && edges.length == 0) {
            result.add(0);
            return result;
        }
        // Create adjacency list
        List<Set<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }
        // Remove leaf nodes
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (adjacencyList.get(i).size() == 1) {
                leaves.add(i);
            }
        }
        while (n > 2) {
            // Identify and remove all leaf nodes
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int leaf : leaves) {
                int neighbor = adjacencyList.get(leaf).iterator().next();
                adjacencyList.get(neighbor).remove(leaf);
                if (adjacencyList.get(neighbor).size() == 1) {
                    newLeaves.add(neighbor);
                }
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}
