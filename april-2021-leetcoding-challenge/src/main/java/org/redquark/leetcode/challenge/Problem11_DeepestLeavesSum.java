package org.redquark.leetcode.challenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, return the sum of values of its deepest leaves.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * 1 <= Node.val <= 100
 */
public class Problem11_DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Total sum of the leaf nodes
        int sum = 0;
        // Get the height of the tree
        int height = getHeight(root);
        // Queue to for BFS
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add root to the queue
        nodes.add(root);
        // Current level
        int level = 1;
        // Loop until queue is empty
        while (!nodes.isEmpty() && level != height) {
            // Increment level by 1
            level++;
            // Get the current size of the queue
            int size = nodes.size();
            // Loop for nodes at the given level
            while (size > 0) {
                // Get the head
                TreeNode currentHead = nodes.poll();
                if (currentHead != null) {
                    // Add nodes at the current level
                    if (currentHead.left != null) {
                        nodes.add(currentHead.left);
                    }
                    if (currentHead.right != null) {
                        nodes.add(currentHead.right);
                    }
                }
                size--;
            }
        }
        // Add all the values in the leaf nodes
        while (!nodes.isEmpty()) {
            sum += nodes.poll().val;
        }
        return sum;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
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
