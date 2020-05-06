package org.redquark.leetcode.learn.binarytrees;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the
 * farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 */
public class Problem05_MaximumDepth {

    /**
     * @param root - root of the binary tree
     * @return - maximum depth of the binary tree
     */
    public int maxDepth(Node root) {
        // Base condition
        if (root == null) {
            return 0;
        }
        // Depth of the left subtree
        int leftDepth = maxDepth(root.left);
        // Depth of the right subtree
        int rightDepth = maxDepth(root.right);

        // Calculate the maximum of the left and right subtree depths and add 1 (for root node)
        return Math.max(leftDepth, rightDepth) + 1;
    }


    /**
     * This class represents each node of the binary tree
     */
    static class Node {
        final int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
