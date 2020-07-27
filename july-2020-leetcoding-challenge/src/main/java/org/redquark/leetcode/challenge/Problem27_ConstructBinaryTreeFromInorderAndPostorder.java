package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 */
public class Problem27_ConstructBinaryTreeFromInorderAndPostorder {

    /**
     * @param inorder   - inorder array
     * @param postorder - postorder array
     * @return root of the binary tree
     */
    public Node buildTree(int[] inorder, int[] postorder) {
        // Start and end pointers of inorder of postorder traversal
        int inStart = 0;
        int inEnd = inorder.length - 1;
        int postStart = 0;
        int postEnd = postorder.length - 1;
        // Recursive function to construct binary tree
        return buildTree(inStart, inEnd, postStart, postEnd, inorder, postorder);
    }

    private Node buildTree(int inStart, int inEnd, int postStart, int postEnd, int[] inorder, int[] postorder) {
        // Base condition
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }
        // Root of the current subtree - it will always be the last element
        // of postorder array
        Node root = new Node(postorder[postEnd]);
        // Index of the root in the inorder array
        int index = 0;
        // Loop through the inorder array until we find the root
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == postorder[postEnd]) {
                index = i;
                break;
            }
        }
        // Left of the root
        root.left = buildTree(inStart, index - 1, postStart,
                postStart + index - (inStart + 1),
                inorder, postorder);
        // Right of the root
        root.right = buildTree(index + 1, inEnd,
                postStart + index - inStart, postEnd - 1,
                inorder, postorder);
        return root;
    }

    /**
     * This class represents each node in the binary tree
     */
    static class Node {
        final int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
