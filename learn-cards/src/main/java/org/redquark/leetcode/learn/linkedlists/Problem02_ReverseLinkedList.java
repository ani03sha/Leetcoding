package org.redquark.leetcode.learn.linkedlists;

public class Problem02_ReverseLinkedList {

    public Node head;

    public Node reverseList(Node head) {
        // Base condition
        if (head == null || head.next == null) {
            return head;
        }
        // Take reference of the head;
        Node current = head;
        Node previous = null;
        Node next;
        // Loop through the entire list
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    public void add(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }

    }

    /**
     * This class represents each node in the linked list
     */
    public static class Node {
        // Data to be stored in the node
        protected final int data;
        // Next pointer of the node
        private Node next;

        /**
         * Constructor that will create a new node for the linked list
         */
        Node(int data) {
            this.data = data;
        }
    }
}
