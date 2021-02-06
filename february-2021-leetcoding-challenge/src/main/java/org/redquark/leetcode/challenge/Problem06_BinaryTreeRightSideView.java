package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the
 * nodes you can see ordered from top to bottom.
 */
public class Problem06_BinaryTreeRightSideView {

    /**
     * @param root - root of the binary tree
     * @return list of nodes which are visible from the right
     */
    public List<Integer> rightSideView(TreeNode root) {
        // Resultant list
        List<Integer> rightView = new ArrayList<>();
        // Special cases
        if (root == null) {
            return rightView;
        }
        // Queue for BFS
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add root to it
        nodes.add(root);
        // Loop until the queue is not empty
        while (!nodes.isEmpty()) {
            // Get the size of the queue
            int size = nodes.size();
            // Loop for the nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode current = nodes.remove();
                // If current node is the last node at
                // the current level, we will add it to
                // the result
                if (i == size - 1) {
                    rightView.add(current.val);
                }
                // Add left child of current node in the
                // queue if not null
                if (current.left != null) {
                    nodes.add(current.left);
                }
                // Add right child of current node in the
                // queue if not null
                if (current.right != null) {
                    nodes.add(current.right);
                }
            }
        }
        return rightView;
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
