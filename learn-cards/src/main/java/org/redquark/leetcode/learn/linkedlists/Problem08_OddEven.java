package org.redquark.leetcode.learn.linkedlists;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a singly linked list, group all odd nodes together followed by the even nodes.
 * Please note here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes)
 * time complexity.
 */
public class Problem08_OddEven {

    /**
     * @param head - head of the list
     * @return head of the odd-even list
     */
    public Node oddEvenList(Node head) {
        // Base condition
        if (head == null || head.next == null) {
            return head;
        }
        // Reference pointer for odd nodes
        Node odd = head;
        // Reference pointer for even nodes
        Node even = head.next;
        // Reference of first node of the even list
        Node evenHead = even;
        // Loop until the end of the list
        while (even != null && even.next != null) {
            // Link current odd to the node after its next (odd ones)
            odd.next = even.next;
            // Move odd pointer ahead
            odd = odd.next;
            // Link current even node to the node after its next (even ones)
            even.next = odd.next;
            // Move even pointer ahead
            even = even.next;
        }
        // At the end, join last of odd list to the first of the head list
        odd.next = evenHead;
        return head;
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
