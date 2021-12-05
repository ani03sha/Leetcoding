package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area, called root.
 * <p>
 * Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that all
 * houses in this place form a binary tree. It will automatically contact the police if two directly-linked houses
 * were broken into on the same night.
 * <p>
 * Given the root of the binary tree, return the maximum amount of money the thief can rob without alerting the police.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * 0 <= Node.val <= 10^4
 */
public class Problem05_HouseRobberIII {

    public int rob(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Lookup array to store the robbed amount when
        // the root is selected and when it is not selected
        int[] lookup = robHelper(root);
        return Math.max(lookup[0], lookup[1]);
    }

    private int[] robHelper(TreeNode node) {
        // Base case
        if (node == null) {
            return new int[2];
        }
        // Get the looted amount for the left subtree
        int[] left = robHelper(node.left);
        // Get the loot amount for the right subtree
        int[] right = robHelper(node.right);
        // Array to store the looted amount
        int[] lookup = new int[2];
        // 1. When root is considered
        lookup[0] = node.val + left[1] + right[1];
        // 2. When root is not considered
        lookup[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return lookup;
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
