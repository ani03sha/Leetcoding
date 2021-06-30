package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * <p>
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes
 * p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant
 * of itself).
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [2, 10^5].
 * -10^9 <= Node.val <= 10^9
 * All Node.val are unique.
 * p != q
 * p and q will exist in the tree.
 */
public class Problem30_LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Special cases
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if ((left == p && right == q) || (left == q && right == p)) {
            return root;
        }
        return left != null ? left : right;
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
