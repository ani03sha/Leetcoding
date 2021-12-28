package org.redquark.leetcoding.challenge;

public class Problem28_MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        // Special case
        if (head == null) {
            return null;
        }
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Loop until fast reaches the end of the list
        while (fast != null && fast.next != null) {
            // Move slow pointer one node ahead
            slow = slow.next;
            // Move fast pointer two nodes ahead
            fast = fast.next.next;
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
}
