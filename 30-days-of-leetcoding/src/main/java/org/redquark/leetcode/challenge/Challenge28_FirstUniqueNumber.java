package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * You have a queue of integers, you need to retrieve the first unique integer in the queue.
 * <p>
 * Implement the FirstUnique class:
 * <p>
 * FirstUnique(int[] nums) Initializes the object with the numbers in the queue.
 * int showFirstUnique() returns the value of the first unique integer of the queue, and returns -1 if there is no such integer.
 * void add(int value) inserts value to the queue.
 */
public class Challenge28_FirstUniqueNumber {

    static class FirstUnique {

        private final DoublyLinkedList keys;
        private final Map<Integer, Node> nodeMap;

        public FirstUnique(int[] numbers) {
            nodeMap = new HashMap<>();
            keys = new DoublyLinkedList();
            for (int number : numbers) {
                add(number);
            }
        }

        public int showFirstUnique() {
            if (!keys.isEmpty()) {
                return keys.getFirstNode().data;
            }
            return -1;
        }

        public void add(int value) {
            // Check if the map already contains the value
            if (nodeMap.containsKey(value)) {
                if (nodeMap.get(value) != null) {
                    keys.remove(nodeMap.get(value));
                    nodeMap.put(value, null);
                }
            } else {
                Node node = keys.add(value);
                nodeMap.put(value, node);
            }
        }

        static class DoublyLinkedList {
            // Head an tail only represent dummy nodes
            // Head of the doubly linked list
            private final Node head;
            // Tail of the doubly linked list
            private final Node tail;

            DoublyLinkedList() {
                this.head = new Node(-1);
                this.tail = new Node(-1);
                head.next = tail;
                tail.previous = head;
            }

            private Node getFirstNode() {
                return head.next;
            }

            public boolean isEmpty() {
                return head.next == tail;
            }

            public void remove(Node node) {
                Node previous = node.previous;
                Node next = node.next;
                previous.next = next;
                next.previous = previous;
            }

            public Node add(int data) {
                Node node = new Node(data);
                Node previous = tail.previous;
                previous.next = node;
                node.next = tail;
                tail.previous = node;
                node.previous = previous;

                return node;
            }
        }

        /**
         * This class represents one node of the doubly linked list
         */
        private static class Node {
            final int data;
            Node previous;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }
    }
}
