package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree),
 * construct the tree and return its root.
 * <p>
 * It is guaranteed that there is always possible to find a binary search tree with the given requirements for the
 * given test cases.
 * <p>
 * A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less
 * than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
 * <p>
 * A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then
 * traverses Node.right.
 * <p>
 * Constraints:
 * <p>
 * 1 <= preorder.length <= 100
 * 1 <= preorder[i] <= 10^8
 * All the values of preorder are unique.
 */
public class Problem13_ConstructBinarySearchTreeFromPreorderTraversal {

    // Index to keep track of the preorder array
    private int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        // Special case
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        return bstFromPreorderHelper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode bstFromPreorderHelper(int[] preorder, int minValue, int maxValue) {
        // Base case
        if (index >= preorder.length || preorder[index] < minValue || preorder[index] > maxValue) {
            return null;
        }
        // Create a node with the value at the current value
        TreeNode node = new TreeNode(preorder[index]);
        // Move the index further
        index++;
        // Set left and right children
        node.left = bstFromPreorderHelper(preorder, minValue, node.val);
        node.right = bstFromPreorderHelper(preorder, node.val, maxValue);
        return node;
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
