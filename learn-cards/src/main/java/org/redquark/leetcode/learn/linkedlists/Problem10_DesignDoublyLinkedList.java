package org.redquark.leetcode.learn.linkedlists;

public class Problem10_DesignDoublyLinkedList {

    static class DoublyLinkedList {
        // Head of the linked list
        private final Node current;
        // Size of the linked list
        private int size;

        DoublyLinkedList() {
            current = new Node(null, null, null);
            current.previous = current;
            current.next = current;
        }

        /**
         * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
         *
         * @param index - value of the index
         * @return - value stored in the index'ed node
         */
        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            Node temp = current.next;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        /**
         * Add a node of value val before the first element of the linked list. After the insertion,
         * the new node will be the first node of the linked list.
         */
        public void addAtHead(int data) {
            Node n = new Node(data, current, current.next);
            current.next.previous = n;
            current.next = n;
            size++;
        }

        /**
         * Append a node of value val to the last element of the linked list.
         */
        public void addAtTail(int data) {
            Node n = new Node(data, current.previous, current);
            current.previous.next = n;
            current.previous = n;
            size++;
        }

        /**
         * Add a node of value val before the index-th node in the linked list.
         * If index equals to the length of linked list, the node will be appended to the end of linked list.
         * If index is greater than the length, the node will not be inserted.
         */
        public void addAtIndex(int index, int data) {
            if (index > size) {
                return;
            }
            Node temp = current.next;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node n = new Node(data, temp.previous, temp);
            temp.previous.next = n;
            temp.previous = n;
            size++;
        }

        /**
         * Delete the index-th node in the linked list, if the index is valid.
         */
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }
            Node temp = current.next;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            size--;
        }


        /**
         * This class represents each node in the Doubly Linked list
         */
        static class Node {
            // Data to be stored in the node
            Integer data;
            // Previous pointer
            Node previous;
            // Next pointer
            Node next;

            /**
             * Constructor
             */
            Node(Integer data, Node previous, Node next) {
                this.data = data;
                this.previous = previous;
                this.next = next;
            }
        }
    }
}
