package org.redquark.leetcode.learn.linkedlists;

public class Problem01_DesignSinglyLinkedList {

    static class SinglyLinkedList {

        // Head (first node) of the linked list
        private Node head;

        /**
         * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
         *
         * @param index - value of the index
         * @return - value stored in the index'ed node
         */
        public int get(int index) {
            // Base condition
            if (head == null) {
                return -1;
            }
            // Counter that will count the nodes
            int count = 0;
            // Take reference of the head node
            Node n = head;
            while (n != null && count < index) {
                n = n.next;
                count++;
            }

            return n != null ? n.data : -1;
        }

        /**
         * Add a node of value val before the first element of the linked list. After the insertion,
         * the new node will be the first node of the linked list.
         */
        public void addAtHead(int data) {
            // Create a new node with the given data
            Node n = new Node(data);
            // If head is null then the new node will itself be the head
            if (head == null) {
                head = n;
            } else {
                // Else we link current head to the next of the new node
                n.next = head;
                // And make new node as the head
                head = n;
            }
        }

        /**
         * Append a node of value val to the last element of the linked list.
         */
        public void addAtTail(int data) {
            // Create a new node
            Node n = new Node(data);
            // If head is null then make the new node as the head
            if (head == null) {
                head = n;
            } else {
                // Take reference of the current head
                Node temp = head;
                // Loop until we reach to the end of the list
                while (temp.next != null) {
                    temp = temp.next;
                }
                // At the end of the loop link temp's next to the new node
                temp.next = n;
            }
        }

        /**
         * Add a node of value val before the index-th node in the linked list.
         * If index equals to the length of linked list, the node will be appended to the end of linked list.
         * If index is greater than the length, the node will not be inserted.
         */
        public void addAtIndex(int index, int data) {
            // Create a new node
            Node n = new Node(data);
            // Check if the head is null
            if (head == null) {
                head = n;
            }
            // For the index = 0
            if (index == 0) {
                n.next = head.next;
                head = n;
            }
            // Get the reference of the head node
            Node temp = head;
            // Counter that will keep track of the nodes traversed
            int count = 0;
            // Loop until we reach to the desired index
            while (temp.next != null && count < index) {
                temp = temp.next;
                count++;
            }
            n.next = temp.next;
            temp.next = n;
        }

        /**
         * Delete the index-th node in the linked list, if the index is valid.
         */
        public void deleteAtIndex(int index) {
            // Base condition
            if (head == null) {
                return;
            }
            // For the index = 0
            if (index == 0) {
                head = head.next;
            }
            // Get the reference of the head
            Node temp = head;
            // Counter to count the nodes
            int count = 0;
            while (temp.next != null && count < index - 1) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next != null ? temp.next.next : null;
        }

        /**
         * This class represents each node in the linked list
         */
        private static class Node {
            // Data to be stored in the node
            private final int data;
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
}
