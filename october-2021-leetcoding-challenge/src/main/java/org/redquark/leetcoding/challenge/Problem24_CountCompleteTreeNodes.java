package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * <p>
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree,
 * and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at
 * the last level h.
 * <p>
 * Design an algorithm that runs in less than O(n) time complexity.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5 * 10^4].
 * 0 <= Node.val <= 5 * 10^4
 * The tree is guaranteed to be complete.
 */
public class Problem24_CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Get the left height and right height of the tree
        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);
        // If both heights are equal, then given tree is a full tree
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int getLeftHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            node = node.left;
            height++;
        }
        return height;
    }

    private int getRightHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            node = node.right;
            height++;
        }
        return height;
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
