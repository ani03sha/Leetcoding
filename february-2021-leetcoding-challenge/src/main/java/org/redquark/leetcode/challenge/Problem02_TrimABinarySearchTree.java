package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary search tree and the lowest and highest boundaries as low and high,
 * trim the tree so that all its elements lies in [low, high].
 * <p>
 * Trimming the tree should not change the relative structure of the elements that will remain in
 * the tree (i.e., any node's descendant should remain a descendant).
 * <p>
 * It can be proven that there is a unique answer.
 * <p>
 * Return the root of the trimmed binary search tree. Note that the root may change
 * depending on the given bounds.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree in the range [1, 10^4].
 * 0 <= Node.val <= 10^4
 * The value of each node in the tree is unique.
 * root is guaranteed to be a valid binary search tree.
 * 0 <= low <= high <= 10^4
 */
public class Problem02_TrimABinarySearchTree {

    /**
     * @param root - root of the binary search tree
     * @param low  - lower limit
     * @param high - upper limit
     * @return root of the trimmed binary search tree
     */
    public TreeNode trimBST(TreeNode root, int low, int high) {
        // Base case
        if (root == null) {
            return null;
        }
        // Recursively fix left and right subtrees
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        // Now fix the tree
        if (root.val < low) {
            return root.right;
        }
        if (root.val > high) {
            return root.left;
        }
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
