package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * <p>
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 * <p>
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently?
 * How would you optimize the kthSmallest routine?
 */
public class Problem20_KthSmallestElementInBST {

    /**
     * @param root - root of the binary tree
     * @param k    - value of the k
     * @return kth smallest element
     */
    public int kthSmallest(Node root, int k) {
        // This array will store the value of k and the value to be returned
        int[] temp = new int[2];
        // Inorder traversal of the tree
        inorder(root, temp, k);
        return temp[1];
    }

    private void inorder(Node node, int[] temp, int k) {
        // Base condition
        if (node == null) {
            return;
        }
        inorder(node.left, temp, k);
        if (++temp[0] == k) {
            temp[1] = node.data;
            return;
        }
        inorder(node.right, temp, k);
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
