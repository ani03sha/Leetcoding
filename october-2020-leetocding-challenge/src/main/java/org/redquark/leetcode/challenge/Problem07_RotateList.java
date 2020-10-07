package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 */
public class Problem07_RotateList {

    /**
     * @param head - head of the original list
     * @param k    - index from where we need to rotate the list
     * @return - head of the rotated list
     */
    public Node rotateRight(Node head, int k) {
        if (head == null || head.next == null && k <= 0) {
            return head;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (k % count == 0) {
            return head;
        } else {
            k = k % count;
        }
        // Logic to find nth node from end
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }

    static class Node {
        final int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
