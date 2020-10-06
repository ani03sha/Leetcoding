package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree.
 * Return the root node of the BST after the insertion.
 * It is guaranteed that the new value does not exist in the original BST.
 * <p>
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a
 * BST after insertion. You can return any of them.
 * <p>
 * The number of nodes in the tree will be in the range [0, 10^4].
 * -10^8 <= Node.val <= 10^8
 * All the values Node.val are unique.
 * -10^8 <= val <= 10^8
 * It's guaranteed that val does not exist in the original BST.
 */
public class Problem06_InsertIntoBST {

    /**
     * @param root - root of the BST
     * @param val  - value to be inserted
     * @return - root of BST after insertion
     */
    public Node insertIntoBST(Node root, int val) {
        // If the root is null, create a new node and return it
        if (root == null) {
            return new Node(val);
        }
        // Recur for left and right subtree according to the value of data
        if (val < root.data) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
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
