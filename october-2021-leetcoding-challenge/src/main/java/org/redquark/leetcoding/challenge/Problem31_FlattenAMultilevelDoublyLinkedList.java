package org.redquark.leetcoding.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a doubly linked list which in addition to the next and previous pointers, it could have a child
 * pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more
 * children of their own, and so on, to produce a multilevel data structure, as shown in the example below.
 * <p>
 * Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of
 * the first level of the list.
 * <p>
 * Constraints:
 * <p>
 * The number of Nodes will not exceed 1000.
 * 1 <= Node.val <= 10^5
 */
public class Problem31_FlattenAMultilevelDoublyLinkedList {

    public Node flatten(Node head) {
        // Special case
        if (head == null) {
            return null;
        }
        // Reference of the head node
        Node temp = head;
        // Stack to store the references
        Stack<Node> nodes = new Stack<>();
        // Loop until we reach to the end of the list
        while (temp != null) {
            // If child of the current node exists
            if (temp.child != null) {
                if (temp.next != null) {
                    nodes.push(temp.next);
                }
                // Move the pointer towards the child linked list
                temp.next = temp.child;
                temp.next.prev = temp;
                temp.child = null;
            } else if (temp.next == null && !nodes.isEmpty()) {
                temp.next = nodes.pop();
                temp.next.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    static class Node {
        final int val;
        Node prev;
        Node next;
        Node child;

        Node(int val) {
            this.val = val;
        }
    }
}
