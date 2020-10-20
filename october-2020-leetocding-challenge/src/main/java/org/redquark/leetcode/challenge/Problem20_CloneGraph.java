package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a reference of a node in a connected undirected graph.
 * <p>
 * Return a deep copy (clone) of the graph.
 * <p>
 * Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.
 * <p>
 * Constraints:
 * <p>
 * - 1 <= Node.val <= 100
 * - Node.val is unique for each node.
 * - Number of Nodes will not exceed 100.
 * - There is no repeated edges and no self-loops in the graph.
 * - The Graph is connected and all nodes can be visited starting from the given node.
 */
public class Problem20_CloneGraph {

    /**
     * @param node - first node
     * @return clone (deep copy) of the graph
     */
    public Node cloneGraph(Node node) {
        // Base condition
        if (node == null) {
            return null;
        }
        Map<Integer, Node> map = new HashMap<>();
        return cloneGraph(node, map);
    }

    private Node cloneGraph(Node node, Map<Integer, Node> map) {
        if (map.containsKey(node.data)) {
            return map.get(node.data);
        }
        Node copy = new Node(node.data);
        map.put(node.data, copy);
        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(cloneGraph(neighbor, map));
        }
        return copy;
    }

    static class Node {
        int data;
        List<Node> neighbors;

        Node() {
            this.data = 0;
            neighbors = new ArrayList<>();
        }

        Node(int data) {
            this.data = data;
            neighbors = new ArrayList<>();
        }

        Node(int data, List<Node> neighbors) {
            this.data = data;
            this.neighbors = neighbors;
        }
    }
}
