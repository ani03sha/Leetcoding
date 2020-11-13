package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children.
 * The binary tree has the following definition:
 * <p>
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no next right node,
 * the next pointer should be set to NULL.
 * <p>
 * Initially, all next pointers are set to NULL.
 * <p>
 * Follow up:
 * <p>
 * You may only use constant extra space.
 * Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the given tree is less than 4096.
 * -1000 <= node.val <= 1000
 */
public class Problem13_PopulatingNextRightPointersInEachNode {

    /**
     * @param root - root of the given binary tree
     * @return root of the binary tree
     */
    public Node connect(Node root) {
        /// Base condition
        if (root == null) {
            return null;
        }
        // Previous level's head
        Node lastHead = root;
        // Previous level's pointer
        Node lastCurrent;
        // Current level's head
        Node currentHead = null;
        // Current level's pointer
        Node current = null;
        // Loop for each node
        while (lastHead != null) {
            lastCurrent = lastHead;
            while (lastCurrent != null) {
                if (currentHead == null) {
                    currentHead = lastCurrent.left;
                    current = lastCurrent.left;
                } else {
                    current.next = lastCurrent.left;
                    current = current.next;
                }
                if (currentHead != null) {
                    current.next = lastCurrent.right;
                    current = current.next;
                }
                lastCurrent = lastCurrent.next;
            }
            lastHead = currentHead;
            currentHead = null;
        }
        return root;
    }


    static class Node {
        final int data;
        Node left;
        Node right;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
