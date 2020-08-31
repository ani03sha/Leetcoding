package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST.
 * Return the root node reference (possibly updated) of the BST.
 * <p>
 * Basically, the deletion can be divided into two stages:
 * <p>
 * Search for a node to remove.
 * If the node is found, delete the node.
 * Note: Time complexity should be O(height of tree).
 */
public class Problem31_DeleteNodeInABST {

    /**
     * @param root - root of the given BST
     * @param key  - value of the node to be deleted
     * @return - root of the tree after deleting the node
     */
    public Node deleteNode(Node root, int key) {
        // Base condition
        if (root == null) {
            return root;
        }
        // If there are some nodes then traverse the node recursively
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            // We will reach here if the node's value is equal to the key
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // Node with two children
            // Find the inorder successor
            root.data = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node node) {
        int min = node.data;
        while (node.left != null) {
            min = node.left.data;
            node = node.left;
        }
        return min;
    }

    /**
     * This class represents each node in the BST
     */
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
