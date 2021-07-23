package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, return the same tree where every subtree (of the given tree)
 * not containing a 1 has been removed.
 * <p>
 * A subtree of a node node is node plus every node that is a descendant of node.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 200].
 * Node.val is either 0 or 1.
 */
public class Problem23_BinaryTreePruning {

    public TreeNode pruneTree(TreeNode root) {
        // Special case
        if (root == null) {
            return null;
        }
        if (!checkForOne(root)) {
            root = null;
        }
        return root;
    }

    private boolean checkForOne(TreeNode node) {
        // Base case
        if (node == null) {
            return false;
        }
        boolean leftContains = checkForOne(node.left);
        boolean rightContains = checkForOne(node.right);
        if (!leftContains) {
            node.left = null;
        }
        if (!rightContains) {
            node.right = null;
        }
        return node.val == 1 || leftContains || rightContains;
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
