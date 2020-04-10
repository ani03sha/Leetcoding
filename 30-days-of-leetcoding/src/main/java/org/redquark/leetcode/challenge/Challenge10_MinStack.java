package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class Challenge10_MinStack {

    // Head of the linked list - underlying data structure of Stack
    private Node top;

    /**
     * @param x - the data to be entered in the node
     */
    public void push(int x) {
        // Create a new node with the given data
        Node node = new Node(x);
        // Check if the head is null
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            // Update the minimum if required (if current element is less than current minimum)
            node.minimum = Math.min(top.minimum, x);
            // Make the new node as the top
            top = node;
        }
    }

    /**
     * This method deletes the top of the stack
     */
    public void pop() {
        if (top == null) {
            return;
        }
        top = top.next;
    }

    /**
     * @return - data stored in the top of the node
     */
    public int top() {
        return top.data;
    }

    /**
     * @return - minimum value in the stack
     */
    public int getMin() {
        if (top == null) {
            return Integer.MAX_VALUE;
        }
        return top.minimum;
    }

    /**
     * This class represents each node in the linked list
     */
    public static class Node {
        // Data to be stored in the linked list
        private int data;
        // Next pointer of the node
        private Node next;
        // Minimum element in the Stack
        private int minimum;

        /**
         * Default constructor
         */
        Node(int data) {
            this.data = data;
            this.next = null;
            this.minimum = data;
        }
    }
}
