package org.redquark.leetcode.learn.binarytrees;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
public class Problem06_SymmetricTree {

    /**
     * @param root - root of the binary tree
     * @return - true, if the tree is symmetric
     */
    public boolean isSymmetric(Node root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(Node n1, Node n2) {
        // Base condition
        if (n1 == null && n2 == null) {
            return true;
        }
        // For a tree to be symmetric following conditions need to be satisfied
        // 1. Data in both the nodes should be same
        // 2. Left subtree of left tree == Right subtree of right tree
        // 3. Right subtree of left tree == Left subtree of right tree
        if (n1 != null && n2 != null && n1.data == n2.data) {
            return isSymmetric(n1.left, n2.right) && isSymmetric(n1.right, n2.left);
        }
        return false;
    }

    /**
     * This class represents each node of the binary tree
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
