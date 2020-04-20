package org.redquark.leetcode.learn.linkedlists;

public class Problem03_LinkedListCycleI {

    /**
     * @param head head of the linked list
     * @return true, if there is a cycle in the node
     */
    public boolean hasCycle(Node head) {
        // Fast pointer
        Node fast = head;
        // Slow pointer
        Node slow = head;
        // Loop until we reach to the end of the list
        while (fast != null && fast.next != null) {
            // Move fast pointer two steps ahead
            fast = fast.next.next;
            // Move slow pointer one step ahead
            slow = slow.next;
            // If after some cycles, slow is equal to the fast then it means there is a cycle in the list
            if (fast == slow) {
                return true;
            }
        }
        return false;
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
