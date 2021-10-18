package org.redquark.leetcoding.challenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y,
 * return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
 * <p>
 * Two nodes of a binary tree are cousins if they have the same depth with different parents.
 * <p>
 * Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [2, 100].
 * 1 <= Node.val <= 100
 * Each node has a unique value.
 * x != y
 * x and y exist in the tree.
 */
public class Problem18_CousinsInBinaryTree {

    public boolean isCousins(TreeNode root, int x, int y) {
        // Special case
        if (root == null) {
            return false;
        }
        // Get the levels of nodes with values x and y respectively
        int levelX = getLevel(root, x);
        int levelY = getLevel(root, y);
        // Given two nodes will be cousins iff their levels are same
        // but they are not siblings
        return levelX == levelY && !areSiblings(root, x, y);
    }

    private boolean areSiblings(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        return ((root.left != null && root.right != null && root.left.val == x && root.right.val == y)
                || (root.left != null && root.right != null && root.right.val == x && root.left.val == y)
                || areSiblings(root.left, x, y)
                || areSiblings(root.right, x, y));
    }

    private int getLevel(TreeNode root, int value) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Queue to store the nodes in the BFS
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add the root node to the queue
        nodes.offer(root);
        // Add null to mark the end of the current level
        nodes.offer(null);
        // Variable to store the level
        int level = 1;
        // Loop until the queue is empty
        while (!nodes.isEmpty()) {
            // Get the current node from the front of the queue
            TreeNode current = nodes.poll();
            // Check if the current node is null, it means the
            // end of level is reached
            if (current == null) {
                // Another check to verify if we actually reach the end
                // of the current level
                if (nodes.peek() != null) {
                    nodes.offer(null);
                }
                level++;
            }
            // If there are more nodes at the current level
            else {
                // Check if the current node has the given value
                if (current.val == value) {
                    return level;
                }
                // Add left and right children to the queue if exist
                if (current.left != null) {
                    nodes.offer(current.left);
                }
                if (current.right != null) {
                    nodes.offer(current.right);
                }
            }
        }
        return 0;
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
