package org.redquark.leetcoding.challenge;

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
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 10^4].
 * -10^5 <= Node.val <= 10^5
 * Each node has a unique value.
 * root is a valid binary search tree.
 * -10^5 <= key <= 10^5
 */
public class Problem22_DeleteNodeInABST {

    public TreeNode deleteNode(TreeNode root, int key) {
        // Special case
        if (root == null) {
            return null;
        }
        // Check which subtree we need to traverse
        // If the key is smaller than the root, then we should
        // search in the left subtree
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        // If the key is greater than the root, then we should
        // search in the right subtree
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        // If we have found the node to delete
        else {
            // If the node to be delete has only one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // If the node has both children, find the minimum value
            // in the right subtree and delete it
            root.val = minimumValue(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private int minimumValue(TreeNode node) {
        int min = node.val;
        while (node.left != null) {
            min = node.left.val;
            node = node.left;
        }
        return min;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
