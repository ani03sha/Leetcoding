package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Invert a binary tree.
 */
public class Problem01_InvertBinaryTree {

    /**
     * @param root - root of the tree
     * @return - root of the inverted tree
     */
    public Node invertTree(Node root) {
        // Base condition
        if (root == null) {
            return null;
        }
        // Get left and right references of the node
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        // Swap the nodes
        root.right = left;
        root.left = right;

        return root;
    }

    static class Node {
        final int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
