package org.redquark.leetcode.learn.linkedlists;

/**
 * @author Anirudh Sharma
 * <p>
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 */
public class Problem05_Intersection {

    /**
     * @param headA head of the first linked list
     * @param headB head of the second linked list
     * @return intersection node
     * <p>
     * Algorithm:
     * 1. Find the lengths of the two linked lists
     * 2. Find the difference between them
     * 3. Move the bigger list by number of nodes equal to the difference
     * 4. Compare both lists' nodes from this point
     * 5. Return when we hit equal nodes
     */
    public Node getIntersectionNode(Node headA, Node headB) {
        // Length of list A
        int m = 0;
        // Length of list B
        int n = 0;
        // Reference of headA
        Node nodeA = headA;
        // Reference of headB
        Node nodeB = headB;
        // Loop through the entire lists to find their lengths
        while (nodeA != null) {
            m++;
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            n++;
            nodeB = nodeB.next;
        }
        // Find the difference between the two
        int difference = Math.abs(m - n);
        Node pointer;
        Node pointerA;
        Node pointerB;
        if (m > n) {
            pointer = headA;
            // Move pointer to the number of steps equal to difference
            for (int i = 0; i < difference; i++) {
                pointer = pointer.next;
            }
            pointerA = pointer;
            pointerB = headB;
        } else {
            pointer = headB;
            // Move pointer to the number of steps equal to difference
            for (int i = 0; i < difference; i++) {
                pointer = pointer.next;
            }
            pointerB = pointer;
            pointerA = headA;
        }
        // Loop until pointerA is equal to pointerB
        while (pointerA != pointerB) {
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }
        return pointerA; // or pointerB
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
