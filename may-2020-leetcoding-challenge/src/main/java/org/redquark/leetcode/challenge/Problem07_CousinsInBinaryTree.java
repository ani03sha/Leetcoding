package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 * <p>
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 * <p>
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 * <p>
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 * <p>
 * Note:
 * <p>
 * The number of nodes in the tree will be between 2 and 100.
 * Each node has a unique integer value from 1 to 100.
 */
public class Problem07_CousinsInBinaryTree {

    /**
     * @param root - root of the binary tree
     * @param x    - first candidate for cousin
     * @param y    - second candidate for cousin
     * @return - true, if x and y are cousins
     */
    public boolean isCousins(Node root, int x, int y) {
        return findDepth(root, x, 1) == findDepth(root, y, 1) && !isSibling(root, x, y);
    }

    private boolean isSibling(Node node, int x, int y) {
        if (node == null) {
            return false;
        }
        boolean flag = false;
        if (node.left != null && node.right != null) {
            flag = (node.left.data == x && node.right.data == y) ||
                    (node.left.data == y && node.right.data == x);
        }
        return flag || isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }

    private int findDepth(Node node, int data, int height) {
        if (node == null) {
            return 0;
        }
        if (node.data == data) {
            return height;
        }
        return findDepth(node.left, data, height + 1) | findDepth(node.right, data, height + 1);
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
