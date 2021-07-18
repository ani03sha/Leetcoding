package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * <p>
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * <p>
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range sz.
 * 1 <= sz <= 5000
 * 0 <= Node.val <= 1000
 * 1 <= k <= sz
 * <p>
 * <p>
 * Follow-up: Can you solve the problem in O(1) extra memory space?
 */
public class Problem18_ReverseNodesInKGroup {

    private static ListNode reverse(ListNode start, ListNode end) {
        // Previous node of the current node
        ListNode previous = start.next;
        // Current node
        ListNode current = previous.next;
        // Next node of the current node
        ListNode next;
        // Loop for the whole interval
        while (current != end) {
            // Next node of the current node
            next = current.next;
            // Next of current will point to the previous
            current.next = start.next;
            // Current node will become the previous node
            start.next = current;
            // Move pointer ahead
            current = next;
        }
        previous.next = end;
        // Return head node of the reversed linked list
        return previous;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        // Base condition
        if (head == null || k == 1) {
            return head;
        }
        // Dummy node before head
        ListNode dummy = new ListNode(-1);
        // Point the next of this dummy to the current head
        dummy.next = head;
        // Node to keep track of the previous node
        ListNode previous = dummy;
        // Variable to keep count of the nodes in the linked list
        int count = 0;
        // Reference to the head which will be used to traverse
        ListNode current = head;
        while (current != null) {
            count++;
            if (count % k == 0) {
                previous = reverse(previous, current.next);
                current = previous.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
