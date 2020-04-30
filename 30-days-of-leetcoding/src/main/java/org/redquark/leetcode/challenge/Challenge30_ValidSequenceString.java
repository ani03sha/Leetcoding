package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree where each path going from the root to any leaf form a valid sequence,
 * check if a given string is a valid sequence in such binary tree.
 * <p>
 * We get the given string from the concatenation of an array of integers arr and the
 * concatenation of all values of the nodes along a path results in a sequence in the
 * given binary tree.
 */
public class Challenge30_ValidSequenceString {

    // Root of the binary tree
    protected Node root;

    public boolean isValidSequence(Node root, int[] arr) {
        // Base condition
        if (root == null) {
            return arr.length == 0;
        }
        return isValidSequence(root, arr, 0);
    }

    private boolean isValidSequence(Node root, int[] arr, int i) {
        if (root.data != arr[i]) {
            return false;
        }
        if (i == arr.length - 1) {
            return root.left == null && root.right == null;
        }
        return (root.left != null && isValidSequence(root.left, arr, i + 1)) ||
                (root.right != null && isValidSequence(root.right, arr, i + 1));
    }

    /**
     * This class represents each node of the Binary Tree
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
