package org.redquark.leetcode.learn.linkedlists;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class Problem12_AddTwoNumbers {

    /**
     * @param l1 - head of the first list
     * @param l2 - head of the second list
     * @return - head of the sum list
     */
    public Node addTwoNumbers(Node l1, Node l2) {
        // Head of the new linked list
        Node head = new Node(0);
        // Reference of the head
        Node temp = head;
        // Carry of sum
        int carry = 0;
        // Loop through both the lists
        while (l1 != null || l2 != null) {
            // Get data stored in both the nodes
            int a = l1 != null ? l1.data : 0;
            int b = l2 != null ? l2.data : 0;
            // Sum of two nodes' data
            int sum = carry + a + b;
            carry = sum / 10;
            int digit = sum % 10;
            // Create a new node with the calculated digit
            temp.next = new Node(digit);
            // Check for the nullability of lists
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            temp = temp.next;
        }
        // Check if there is an extra digit
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        return head.next;
    }

    /**
     * This class represents each node in the Doubly Linked list
     */
    static class Node {
        // Data to be stored in the node
        int data;
        // Next pointer
        Node next;

        /**
         * Constructor
         */
        Node(int data) {
            this.data = data;
        }
    }
}
