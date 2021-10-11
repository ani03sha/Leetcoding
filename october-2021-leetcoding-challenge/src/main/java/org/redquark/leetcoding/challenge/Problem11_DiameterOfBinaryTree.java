package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * <p>
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 * <p>
 * The length of a path between two nodes is represented by the number of edges between them.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * -100 <= Node.val <= 100
 */
public class Problem11_DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Height height = new Height();
        return diameter(root, height);
    }

    /**
     * @param node   - root of the tree
     * @param height - height of the current node
     * @return - diameter of the tree
     */
    private int diameter(TreeNode node, Height height) {
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

    private static class Height {
        private int h;
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
