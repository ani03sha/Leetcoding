package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes
 * of the list from position left to position right, and return the reversed list.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is n.
 * 1 <= n <= 500
 * -500 <= Node.val <= 500
 * 1 <= left <= right <= n
 * <p>
 * <p>
 * Follow up: Could you do it in one pass?
 */
public class Problem23_ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Base condition
        if (head == null) {
            return null;
        }
        // Current node
        ListNode current = head;
        // Previous node
        ListNode previous = null;
        // Loop until m
        for (int i = 0; i < left - 1; i++) {
            previous = current;
            current = current.next;
        }
        // Reference of the node which is the last node in the original order
        ListNode originalLast = previous;
        // Next of the current node
        ListNode next;
        // Reference of the current node in the original order
        ListNode temp = current;
        while (left <= right) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            left++;
        }
        if (originalLast != null) {
            originalLast.next = previous;
        } else {
            head = previous;
        }
        temp.next = current;
        return head;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
