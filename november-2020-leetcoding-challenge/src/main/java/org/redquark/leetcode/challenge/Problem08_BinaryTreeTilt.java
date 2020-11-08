package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, return the sum of every tree node's tilt.
 * <p>
 * The tilt of a tree node is the absolute difference between the sum of all left subtree node
 * values and all right subtree node values.
 * <p>
 * If a node does not have a left child, then the sum of the left subtree node values is
 * treated as 0. The rule is similar if there the node does not have a right child.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 10^4].
 * -1000 <= Node.val <= 1000
 */
public class Problem08_BinaryTreeTilt {

    private int tilt = 0;

    /**
     * @param root - root of the binary tree
     * @return tilt
     */
    public int findTilt(Node root) {
        postOrder(root);
        return tilt;
    }

    private int postOrder(Node root) {
        if (root == null) {
            return 0;
        }
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.data;
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
