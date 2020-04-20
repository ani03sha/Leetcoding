package org.redquark.leetcode.learn.linkedlists;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a linked list, remove the n-th node from the end of list and return its head.
 */
public class Problem06_RemoveNthNodeFromEnd {

    public Node removeNthFromEnd(Node head, int n) {
        // Create a slow pointer
        Node slow = head;
        // Create fast pointer
        Node fast = head;
        // Move fast pointer until it reaches n
        for (int i = 0; i < n; i++) {
            if (fast.next == null) {
                if (i == n - 1) {
                    head = head.next;
                }
                return head;
            }
            fast = fast.next;
        }
        // Loop until fast is null (end of list)
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }

    /**
     * This class represents each node in the linked list
     */
    static class Node {
        // Data to be stored in the node
        final int data;
        // Next pointer of the node
        Node next;

        /**
         * Constructor that will create a new node for the linked list
         */
        Node(int data) {
            this.data = data;
        }
    }
}
