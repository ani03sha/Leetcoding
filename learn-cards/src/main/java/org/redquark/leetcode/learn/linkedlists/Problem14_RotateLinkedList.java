package org.redquark.leetcode.learn.linkedlists;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 */
public class Problem14_RotateLinkedList {

    /**
     * @param head - head of the original list
     * @param k    - rotation factor
     * @return head of the rotated list
     */
    public Node rotate(Node head, int k) {
        // Base conditions
        if (head == null || head.next == null || k <= 0) {
            return head;
        }
        // Now, count the number of nodes in the linked list
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        // If the number of nodes in the linked list is equal to or divisible by the rotation factor then
        // we don't need to rotate anything, we will just return the head
        if (k % count == 0) {
            return head;
        }
        // If the rotation factor is more than the length of the linked list
        if (count < k) {
            k = k % count;
        }
        // Now, we will find the kth node from the end
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        // Now, move slow to find out the kth node from the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Now, rotation happens
        Node newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
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
