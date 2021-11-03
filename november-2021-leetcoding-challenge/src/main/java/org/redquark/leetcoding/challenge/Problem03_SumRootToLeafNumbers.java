package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given the root of a binary tree containing digits from 0 to 9 only.
 * <p>
 * Each root-to-leaf path in the tree represents a number.
 * <p>
 * For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
 * Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a
 * 32-bit integer.
 * <p>
 * A leaf node is a node with no children.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 1000].
 * 0 <= Node.val <= 9
 * The depth of the tree will not exceed 10.
 */
public class Problem03_SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int sum) {
        // Base condition
        if (root == null) {
            return 0;
        }
        // Update the sum
        sum = sum * 10 + root.val;
        // If the current node is the leaf node
        if (root.left == null && root.right == null) {
            return sum;
        }
        // Recurse for left and right subtrees
        return helper(root.left, sum) + helper(root.right, sum);
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
