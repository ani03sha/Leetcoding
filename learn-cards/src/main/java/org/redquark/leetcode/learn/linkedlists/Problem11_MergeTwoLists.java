package org.redquark.leetcode.learn.linkedlists;

/**
 * @author Anirudh Sharma
 * <p>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together
 * the nodes of the first two lists.
 * <p>
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class Problem11_MergeTwoLists {

    /**
     * @param l1 - head of the first list
     * @param l2 - head of the second list
     * @return head of the merged list
     */
    public Node mergeTwoLists(Node l1, Node l2) {
        // Base conditions
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        // Head of the new merged linked list
        Node head;
        // Check both the heads - the smaller will become the head of the new linked list
        if (l1.data < l2.data) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
        // Take reference of the head
        Node temp = head;
        // Loop for both the lists
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        // Loop first list for the remaining elements, if any
        while (l1 != null) {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }
        // Loop second list for the remaining elements, if any
        while (l2 != null) {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }
        return head;
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
