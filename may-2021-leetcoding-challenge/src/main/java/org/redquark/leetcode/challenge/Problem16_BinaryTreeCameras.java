package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, we install cameras on the nodes of the tree.
 * <p>
 * Each camera at a node can monitor its parent, itself, and its immediate children.
 * <p>
 * Calculate the minimum number of cameras needed to monitor all nodes of the tree.
 * <p>
 * Note:
 * <p>
 * The number of nodes in the given tree will be in the range [1, 1000].
 * Every node has value 0.
 */
public class Problem16_BinaryTreeCameras {

    private int count = 0;

    public int minCameraCover(TreeNode root) {
        if (dfs(root) == -1) {
            count++;
        }
        return count;
    }

    private int dfs(TreeNode root) {
        // Flag for left and right children
        int left = 0;
        int right = 0;
        // Check for leaft nodes
        if (root.left == null && root.right == null) {
            return -1;
        }
        // If left child is not null
        if (root.left != null) {
            left = dfs(root.left);
        }
        // If right child is not null
        if (root.right != null) {
            right = dfs(root.right);
        }
        // If we have found there is no camera,
        // then we will install one.
        if (left == -1 || right == -1) {
            count++;
            return 1;
        }
        // If we have not traversed the nodes yet
        if (left == 0 && right == 0) {
            return -1;
        }
        // If the node has camera, then we skip
        if (left == 1 || right == 1) {
            return 0;
        }
        return count;
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
