package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 */
public class Challenge08_MiddleOfLinkedList {

    // Head of the linked list
    protected Node head;

    /**
     * @param val - data to be stored in the list
     */
    public void addNode(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    /**
     * @param node - Head of the linked list
     * @return middle node of the linked list
     * <p>
     * Algorithm:
     * 1. Create 2 pointers - slow and fast
     * 2. Move fast two steps while slow one step at a time until null
     * 3. By the time fast reaches to the end, the slow will be in the middle
     */
    public Node middleNode(Node node) {
        // Fast pointer
        Node fast = node;
        // Slow pointer
        Node slow = node;
        // Loop until null
        while (fast != null && fast.next != null) {
            // Move fast pointer two steps ahead
            fast = fast.next.next;
            // Move slow pointer one step ahead
            slow = slow.next;
        }
        // Return the slow pointer which will be in the middle
        return slow;
    }

    /**
     * This inner class represents each node in the linked list
     */
    public static class Node {
        // Data to be stored in the list
        protected int val;
        // Next pointer of the node
        protected Node next;

        /**
         * Constructor
         */
        Node(int x) {
            this.val = x;
        }
    }
}
