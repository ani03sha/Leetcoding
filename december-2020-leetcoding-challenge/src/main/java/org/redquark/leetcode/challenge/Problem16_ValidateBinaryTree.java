package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharmaz
 * <p>
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * -2^31 <= Node.val <= 2^31 - 1
 */
public class Problem16_ValidateBinaryTree {

    /**
     * @param root - root of the BST
     * @return true, if valid BST, false otherwise
     */
    public boolean isValidBST(Node root) {
        return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    private boolean isValidBST(Node root, double minValue, double maxValue) {
        if (root == null) {
            return true;
        }
        if (root.data <= minValue || root.data >= maxValue) {
            return false;
        }
        boolean left = isValidBST(root.left, minValue, root.data);
        boolean right = isValidBST(root.right, root.data, maxValue);

        return left && right;
    }

    static class Node {
        final int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
