package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, return the sum of every tree node's tilt.
 * <p>
 * The tilt of a tree node is the absolute difference between the sum of all left subtree node values and all
 * right subtree node values. If a node does not have a left child, then the sum of the left subtree node values
 * is treated as 0. The rule is similar if there the node does not have a right child.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 10^4].
 * -1000 <= Node.val <= 1000
 */
public class Problem08_BinaryTreeTilt {

    private int tilt = 0;

    public int findTilt(TreeNode root) {
        postOrder(root);
        return tilt;
    }

    private int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.val;
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
