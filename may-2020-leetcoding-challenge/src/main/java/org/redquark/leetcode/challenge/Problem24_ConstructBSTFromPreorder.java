package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Return the root node of a binary search tree that matches the given preorder traversal.
 * <p>
 * (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has
 * a value < node.val, and any descendant of node.right has a value > node.val.
 * Also recall that a preorder traversal displays the value of the node first, then traverses node.left,
 * then traverses node.right.)
 * <p>
 * It's guaranteed that for the given test cases there is always possible to find a binary search tree with
 * the given requirements.
 */
public class Problem24_ConstructBSTFromPreorder {

    public Node bstFromPreorder(int[] preorder) {
        return buildTree(preorder, 0, preorder.length - 1);
    }

    private Node buildTree(int[] preorder, int l, int r) {
        // Base condition
        if (l > r) {
            return null;
        }
        // First element of the preorder array will be the root of the tree
        Node root = new Node(preorder[l]);
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
     * This class represents each node on the binary search tree
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
