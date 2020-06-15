package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's
 * value equals the given value.
 * <p>
 * Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
 * <p>
 * Note that an empty tree is represented by NULL, therefore you would see the expected output (serialized tree format)
 * as [], not null.
 */
public class Problem15_SearchInBST {

    /**
     * @param root - root of the BST
     * @param key  - element to search
     * @return - subtree having data as the root node
     */
    public Node searchBST(Node root, int key) {
        // Base condition
        if (root == null || root.data == key) {
            return root;
        }
        // If the key is present in the left subtree
        else if (key < root.data) {
            return searchBST(root.left, key);
        }
        // If the key is present in the right subtree
        else {
            return searchBST(root.right, key);
        }
    }

    /**
     * This class represents each node in the BST
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
