package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 2000].
 * -1000 <= Node.val <= 1000
 */
public class Problem20_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // Resultant list
        List<List<Integer>> result = new ArrayList<>();
        // Special case
        if (root == null) {
            return result;
        }
        // Queue to store nodes
        Queue<TreeNode> nodes = new LinkedList<>();
        // Process root node
        nodes.add(root);
        // Loop until the queue is empty
        while (!nodes.isEmpty()) {
            // Get the size of the queue. This represents the
            // number of nodes at a given level
            int size = nodes.size();
            // Loop for every node at the given level
            List<Integer> currentLevelNodes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // Current node
                TreeNode currentNode = nodes.poll();
                // Add this node to the list
                if (currentNode != null) {
                    currentLevelNodes.add(currentNode.val);
                    // Check for left and right children
                    if (currentNode.left != null) {
                        nodes.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        nodes.add(currentNode.right);
                    }
                }
            }
            // Add current level nodes to final result
            result.add(currentLevelNodes);
        }
        return result;
    }

    static class TreeNode {
        final int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
