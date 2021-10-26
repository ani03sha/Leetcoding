package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, invert the tree, and return its root.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class Problem26_InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        // Base case
        if (root == null) {
            return null;
        }
        // Recurse for left and right subtrees
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        // Swap left and right children
        root.right = left;
        root.left = right;
        return root;
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
