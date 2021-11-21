package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and
 * postorder is the postorder traversal of the same tree, construct and return the binary tree.
 * <p>
 * Constraints:
 * <p>
 * 1 <= inorder.length <= 3000
 * postorder.length == inorder.length
 * -3000 <= inorder[i], postorder[i] <= 3000
 * inorder and postorder consist of unique values.
 * Each value of postorder also appears in inorder.
 * inorder is guaranteed to be the inorder traversal of the tree.
 * postorder is guaranteed to be the postorder traversal of the tree.
 */
public class Problem21_ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Special case
        if (inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        // Total elements in array
        int n = inorder.length;
        // Map to store the index of Tree elements
        Map<Integer, Integer> elements = new HashMap<>();
        // Populate the map
        for (int i = 0; i < n; i++) {
            elements.put(inorder[i], i);
        }
        // Construct tree recursively
        return buildTree(0, n - 1, postorder, 0, n - 1, elements);
    }

    private TreeNode buildTree(int inStart, int inEnd, int[] postorder, int postStart, int postEnd, Map<Integer, Integer> elements) {
        // Base case
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }
        // Create the root of the current subtree
        TreeNode root = new TreeNode(postorder[postEnd]);
        // Get the index of this element in the inorder array
        int index = elements.get(postorder[postEnd]);
        // Create left and right subtrees
        root.left = buildTree(inStart, index - 1, postorder, postStart, postStart + index - inStart - 1, elements);
        root.right = buildTree(index + 1, inEnd, postorder, postStart + index - inStart, postEnd - 1, elements);
        return root;
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
