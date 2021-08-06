package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an n-ary tree, return the level order traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal, each group of children
 * is separated by the null value.
 * <p>
 * Constraints:
 * <p>
 * The height of the n-ary tree is less than or equal to 1000
 * The total number of nodes is between [0, 10^4]
 */
public class Problem06_NAryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        // List to store output
        List<List<Integer>> output = new ArrayList<>();
        // Special case
        if (root == null) {
            return output;
        }
        // Queue to store the nodes
        Queue<Node> nodes = new LinkedList<>();
        // Add the root node to the list
        nodes.add(root);
        // Loop until the queue is empty
        while (!nodes.isEmpty()) {
            // Get the number of nodes at the current level
            int size = nodes.size();
            // List the nodes at the current level
            List<Integer> currentLevelNodes = new ArrayList<>();
            // Loop for all the nodes at the current level
            for (int i = 0; i < size; i++) {
                // Current node
                Node current = nodes.poll();
                // Add this node to the list
                if (current != null) {
                    currentLevelNodes.add(current.val);
                    // Check for all the children
                    List<Node> children = current.children;
                    if (children != null) {
                        nodes.addAll(children);
                    }
                }
            }
            // Add current level nodes to the output
            output.add(currentLevelNodes);
        }
        return output;
    }

    static class Node {
        final int val;
        List<Node> children;

        Node(int val) {
            this.val = val;
        }

        Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
}
