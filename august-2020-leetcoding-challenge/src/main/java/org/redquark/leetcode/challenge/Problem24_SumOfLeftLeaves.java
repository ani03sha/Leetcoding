package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Find the sum of all left leaves in a given binary tree.
 */
public class Problem24_SumOfLeftLeaves {

    /**
     * @param root - root of the binary tree
     * @return sum of values of all the nodes in the left
     */
    public int sumOfLeftLeaves(Node root) {
        // Base condition
        if (root == null) {
            return 0;
        } else if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.data + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
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
