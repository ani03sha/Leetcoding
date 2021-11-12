package org.redquark.leetcoding.challenge;

public class Problem12_RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        // If head has the value that needs to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }
        // Current and previous nodes
        ListNode current = head;
        ListNode previous = null;
        // Loop through the list
        while (current != null) {
            // If current nodes needs to be deleted
            if (current.val == val) {
                previous.next = current.next;
            } else {
                previous = current;
            }
            current = current.next;
        }
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
