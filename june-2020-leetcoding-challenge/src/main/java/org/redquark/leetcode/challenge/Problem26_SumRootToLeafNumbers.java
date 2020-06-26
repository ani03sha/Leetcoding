package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * <p>
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * <p>
 * Find the total sum of all root-to-leaf numbers.
 * <p>
 * Note: A leaf is a node with no children.
 */
public class Problem26_SumRootToLeafNumbers {

    /**
     * @param root - root of the binary tree
     * @return sum of all the root to leaf paths
     */
    public int sumNumbers(Node root) {
        return sumNumbers(root, 0);
    }

    private int sumNumbers(Node node, int sum) {
        // Base condition
        if (node == null) {
            return 0;
        }
        // Update the sum
        sum = sum * 10 + node.data;
        // For the leaf nodes
        if (node.left == null && node.right == null) {
            return sum;
        }
        // Recur for the subtrees
        return sumNumbers(node.left, sum) + sumNumbers(node.right, sum);
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
