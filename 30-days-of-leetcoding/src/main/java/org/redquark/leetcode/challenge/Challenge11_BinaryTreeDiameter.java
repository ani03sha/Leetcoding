package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, you need to compute the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 */
public class Challenge11_BinaryTreeDiameter {

    // Root of the binary tree
    public Node root;

    /**
     * @param root - root of the tree
     * @return - Height of the binary tree
     * <p>
     * This function computes the "height" of a tree. Height is the number f nodes along the longest path from
     * the root node down to the farthest leaf node.
     */
    private int height(Node root) {
        // Base condition - if the root is null which means there is no tree
        if (root == null) {
            return 0;
        }
        // If the tree is not empty then the height will be 1 + max(height(left), height(right)
        return (1 + Math.max(height(root.left), height(root.right)));
    }

    /**
     * @param root - root of the binary tree
     * @return - diameter of the binary tree
     */
    public int diameter(Node root) {
        Height height = new Height();
        return diameter(root, height);
    }

    /**
     * @param node   - root of the tree
     * @param height - height of the current node
     * @return - diameter of the tree
     */
    private int diameter(Node node, Height height) {
        // Height of left subtree
        Height lh = new Height();
        // Height of the right subtree
        Height rh = new Height();
        // Base condition
        if (node == null) {
            height.h = 0;
            return 0;
        }
        // LDiameter = Diameter of left subtree
        // rDiameter = Diameter of right subtree
        // Get heights of let and right subtrees and stored with the diameters
        int lDiameter = diameter(node.left, lh);
        int rDiameter = diameter(node.right, rh);
        // Height of current node is the max of heights of left and right subtree plus 1
        height.h = Math.max(lh.h, rh.h) + 1;
        return Math.max(lh.h + rh.h, Math.max(lDiameter, rDiameter));
    }

    /**
     * This class represents each node in the binary tree
     */
    public static class Node {
        // Left child
        public Node left;
        // Right child
        public Node right;
        // Data to be stored in the node
        private int data;

        /**
         * Default constructor
         */
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Utility class for the height object
     */
    private static class Height {
        private int h;
    }
}
