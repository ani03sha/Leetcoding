package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the head of a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth
 * of the two subtrees of every node never differ by more than 1.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in head is in the range [0, 2 * 10^4].
 * -10^5 <= Node.val <= 10^5
 */
public class Problem06_ConvertSortedListToBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head) {
        // Base case
        if (head == null) {
            return null;
        }
        // Find the middle node of the linked list
        ListNode middleNode = findMiddle(head);
        // Create root of the tree with this middle node
        TreeNode root = new TreeNode(middleNode.val);
        // For single node in the linked list
        if (head == middleNode) {
            return root;
        }
        // Recursively create left and right subtrees
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(middleNode.next);
        return root;
    }

    private ListNode findMiddle(ListNode head) {
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Node to keep track of previous node of slow
        ListNode previous = head;
        // Loop until fast node reaches to the end of the list
        while (fast != null && fast.next != null) {
            previous = slow;
            // Move slow pointer one step ahead
            slow = slow.next;
            // Move fast pointer to two steps ahead
            fast = fast.next.next;
        }
        // Unlink left and right parts
        if (previous != null) {
            previous.next = null;
        }
        return slow;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class TreeNode {
        final int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
