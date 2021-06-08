package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary
 * tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 * <p>
 * Constraints:
 * <p>
 * 1 <= preorder.length <= 3000
 * inorder.length == preorder.length
 * -3000 <= preorder[i], inorder[i] <= 3000
 * preorder and inorder consist of unique values.
 * Each value of inorder also appears in preorder.
 * preorder is guaranteed to be the preorder traversal of the tree.
 * inorder is guaranteed to be the inorder traversal of the tree.
 */
public class Problem08_ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode helper(int preorderStart, int inorderStart, int inorderEnd, int[] preorder, int[] inorder) {
        // Base case
        if (preorderStart > preorder.length - 1 || inorderStart > inorderEnd) {
            return null;
        }
        // Now our root would be the element at preorder[preorderStart]
        TreeNode root = new TreeNode(preorder[preorderStart]);
        // Index of root value in inorder array
        int index = 0;
        // Serach the value of root in the inorder array for left and right children
        for (int i = inorderStart; i <= inorderEnd; i++) {
            if (root.val == inorder[i]) {
                index = i;
                break;
            }
        }
        // Recursively create left and right subtrees
        root.left = helper(preorderStart + 1, inorderStart, index - 1, preorder, inorder);
        root.right = helper(preorderStart + index - inorderStart + 1, index + 1, inorderEnd, preorder, inorder);
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
