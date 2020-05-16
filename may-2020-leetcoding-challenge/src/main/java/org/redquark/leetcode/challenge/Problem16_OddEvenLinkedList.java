package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a singly linked list, group all odd nodes together followed by the even nodes.
 * Please note here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and
 * O(nodes) time complexity.
 */
public class Problem16_OddEvenLinkedList {

    /**
     * @param head - head of the linked list
     * @return - modified linked list with odd and even nodes
     */
    public Node oddEvenList(Node head) {
        // Base condition
        if (head == null) {
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    /**
     * This class represents each node in the linked list
     */
    static class Node {
        final int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
