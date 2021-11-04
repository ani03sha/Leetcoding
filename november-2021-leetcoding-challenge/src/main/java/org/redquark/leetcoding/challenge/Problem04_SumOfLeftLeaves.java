package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, return the sum of all left leaves.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 1000].
 * -1000 <= Node.val <= 1000
 */
public class Problem04_SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        // Check if the current node is the left leave node
        else if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        // Exploring the tree further
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
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
