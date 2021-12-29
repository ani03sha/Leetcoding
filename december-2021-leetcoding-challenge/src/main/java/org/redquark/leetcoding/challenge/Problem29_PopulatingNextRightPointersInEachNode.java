package org.redquark.leetcoding.challenge;

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
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer
 * should be set to NULL.
 * <p>
 * Initially, all next pointers are set to NULL.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 212 - 1].
 * -1000 <= Node.val <= 1000
 * <p>
 * <p>
 * Follow-up:
 * <p>
 * You may only use constant extra space.
 * The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.
 */
public class Problem29_PopulatingNextRightPointersInEachNode {

    public Node connect(Node root) {
        // Special case
        if (root == null) {
            return null;
        }
        // Pointer for denoting the current node
        Node current = root;
        // Since this is a complete binary tree, as long as we have left
        // child not null, we will be moving towards the next level
        while (current.left != null) {
            // Left child of the current node will be the first
            // node in the next level
            Node nextLevel = current.left;
            // Now populate the next pointers of the next level nodes
            while (current != null) {
                current.left.next = current.right;
                // If next of current is null, it means it's right child
                // will be the last node of the level, therefore, its next
                // will be null. If current node is not null, then we will
                // fix the next pointers
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                // Move to the next node on this level
                current = current.next;
            }
            // Move to the next level
            current = nextLevel;
        }
        return root;
    }

    static class Node {
        final int val;
        Node left;
        Node right;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
