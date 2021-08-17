package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no
 * nodes with a value greater than X.
 * <p>
 * Return the number of good nodes in the binary tree.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the binary tree is in the range [1, 10^5].
 * Each node's value is between [-10^4, 10^4].
 */
public class Problem17_CountGoodNodesInBinaryTree {

    public int goodNodes(TreeNode root) {
        return helper(root, Integer.MIN_VALUE);
    }

    private int helper(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        int current = 0;
        if (max <= root.val) {
            current++;
        }
        max = Math.max(max, root.val);
        return helper(root.left, max) + helper(root.right, max) + current;
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
