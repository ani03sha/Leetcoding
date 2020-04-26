package org.redquark.leetcode.learn.linkedlists;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a doubly linked list which in addition to the next and previous pointers, it could have
 * a child pointer, which may or may not point to a separate doubly linked list.
 * These child lists may have one or more children of their own, and so on, to produce a multilevel
 * data structure.
 * <p>
 * Flatten the list so that all the nodes appear in a single-level, doubly linked list.
 * You are given the head of the first level of the list.
 */
public class Problem13_FlattenLinkedList {

    /**
     * @param head - head of the linked list
     * @return head of the flattened linked list
     */
    public Node flatten(Node head) {
        // Reference of the head
        Node temp = head;
        // Stack that will store the references
        Stack<Node> remainingNodes = new Stack<>();
        // Loop until we reach to the end of the list
        while (temp != null) {
            // If the node has a child
            if (temp.child != null) {
                // If the node also has a next
                if (temp.next != null) {
                    // Then we remove the next nodes in the stack to keep their reference
                    remainingNodes.push(temp.next);
                }
                // Now, the next of current node will point to the child
                temp.next = temp.child;
                // Link previous of child to the next
                temp.next.previous = temp;
                // Since we have flattened the child here, so make its reference as null
                temp.child = null;
            }
            // If the next node is null but there are values in stack
            else if (temp.next == null && remainingNodes.size() > 0) {
                // Pop the first node's reference and link it to the next of current node
                temp.next = remainingNodes.pop();
                // Link previous of popped node to the current node
                temp.next.previous = temp;
            }
            // Move temp one pointer ahead
            temp = temp.next;
        }
        return head;
    }

    /**
     * This class represents each node of the linked list
     */
    static class Node {
        final int data;
        Node previous;
        Node next;
        Node child;

        Node(int data) {
            this.data = data;
        }
    }
}
