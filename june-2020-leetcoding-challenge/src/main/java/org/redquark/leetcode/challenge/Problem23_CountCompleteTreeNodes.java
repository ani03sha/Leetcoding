package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a complete binary tree, count the number of nodes.
 * <p>
 * Note:
 * <p>
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last
 * level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 */
public class Problem23_CountCompleteTreeNodes {

    /**
     * @param root - root of the binary tree
     * @return count of nodes in the complete binary tree
     */
    public int countNodes(Node root) {
        // Base condition
        if (root == null) {
            return 0;
        }
        // Left pointer - this will go only left
        Node left = root;
        // Left subtree level counter
        int countLeft = 0;
        // Right pointer - this will go only right
        Node right = root;
        // Right subtree level counter
        int countRight = 0;
        // Loop for the left subtree
        while (left != null) {
            countLeft++;
            left = left.left;
        }
        // Loop for the right subtree
        while (right != null) {
            countRight++;
            right = right.right;
        }
        // If the heights of both are same, it means all the levels are filled completely
        if (countLeft == countRight) {
            return (1 << countLeft) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
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
