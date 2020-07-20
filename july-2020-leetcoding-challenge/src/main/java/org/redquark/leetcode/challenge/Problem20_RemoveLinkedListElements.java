package org.redquark.leetcode.challenge;

public class Problem20_RemoveLinkedListElements {

    public Node removeElements(Node head, int val) {
        // Get the reference of the head node
        Node current = head;
        // If the key is at head or there are multiple occurrences
        while (current != null && current.data == val) {
            // Move head to the next position
            head = current.next;
            // Now the current will be the new head in the previous position
            current = head;
        }
        // Previous node of the current
        Node previous = null;
        // Delete occurrences other than head
        while (current != null) {
            // We will now check for the val in all the nodes and will keep track of the previous node
            while (current != null && current.data != val) {
                previous = current;
                current = current.next;
            }
            // At the end of the loop if temp is null then the key is not present
            if (current == null) {
                return head;
            }
            // Delete the node
            previous.next = current.next;
            // Move to next node
            current = current.next;
        }
        return head;
    }

    /**
     * This class represents each node in the linked list
     */
    static class Node {
        final int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
