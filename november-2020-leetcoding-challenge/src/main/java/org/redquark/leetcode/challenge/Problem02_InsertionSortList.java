package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Sort a linked list using insertion sort.
 * <p>
 * Algorithm of Insertion Sort:
 * <p>
 * >> Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
 * >> At each iteration, insertion sort removes one element from the input data, finds the location it belongs
 * within the sorted list, and inserts it there.
 * >> It repeats until no input elements remain.
 */
public class Problem02_InsertionSortList {

    /**
     * @param head - head of the linked list
     * @return - sorted linked list
     */
    public Node insertionSortList(Node head) {
        // Dummy node
        Node dummy = new Node(Integer.MIN_VALUE);
        // Reference of head
        Node current = head;
        // Pointer to next node
        Node next;
        // Loop through the list
        while (current != null) {
            // Update next node
            next = current.next;
            // Temp node
            Node temp = dummy;
            // Loop for the subarray
            while (temp.next != null && temp.next.data < current.data) {
                temp = temp.next;
            }
            // Move the pointer ahead
            current.next = temp.next;
            temp.next = current;
            current = next;
        }
        return dummy.next;
    }

    static class Node {
        final int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
