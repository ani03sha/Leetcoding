package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Return the root node of a binary search tree that matches the given preorder traversal.
 * <p>
 * (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left
 * has a value < node.val, and any descendant of node.right has a value > node.val.
 * Also recall that a preorder traversal displays the value of the node first, then traverses node.left,
 * then traverses node.right.)
 */
public class Challenge20_ConstructBSTFromPreorder {

    /**
     * @param preorder - array if preorder traversal
     * @return root of the BST
     * <p>
     * Algorithm:
     * 1. Assign first array element as root of the tree
     * 2. Divide the array into left subtree and right subtree halves
     * 3. Using an index variable which will increment until we reach an element greater than root
     * 4. Recursively do this for left and right subtrees
     */
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, 0, preorder.length - 1);
    }

    /**
     * @param preorder - preorder traversal array
     * @param l        - left index of the subtree
     * @param r        - right index of the subtree
     * @return - root of the BST
     */
    private TreeNode buildTree(int[] preorder, int l, int r) {
        // Base condition
        if (l > r) {
            return null;
        }
        // First element of the preorder array will be the root of the tree
        TreeNode root = new TreeNode(preorder[0]);
        // It means there is only one node
        if (l == r) {
            return root;
        }
        // For rest of the cases, we do below
        // Index that will keep track of subtrees
        int index = l + 1;
        // Loop until we reach to the end of the tree or we find an element greater than the root
        while (index <= r && preorder[index] < preorder[l]) {
            index++;
        }
        // Recursive calls for left and right subtree
        root.left = buildTree(preorder, l + 1, index - 1);
        root.right = buildTree(preorder, index, r);

        return root;
    }

    /**
     * This  class represents each node of the BST
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
