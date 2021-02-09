package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that
 * every key of the original BST is changed to the original key plus sum of all keys
 * greater than the original key in BST.
 * <p>
 * As a reminder, a binary search tree is a tree that satisfies these constraints:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 10^4].
 * -10^4 <= Node.val <= 10^4
 * All the values in the tree are unique.
 * root is guaranteed to be a valid binary search tree.
 */
public class Problem09_ConvertBSTToGreaterTree {

    // Sum to be stored in the node
    private int sum;

    /**
     * @param root - root of the BST
     * @return root of the greater tree
     */
    public TreeNode convertBST(TreeNode root) {
        // Special case
        if (root == null) {
            return null;
        }
        // Recur for right subtree
        convertBST(root.right);
        // Added the sum of current val and sum calculated
        root.val += sum;
        // Updated the value of sum
        sum = root.val;
        // Recur for left subtree
        convertBST(root.left);
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
