package org.redquark.leetcode.challenge;

/**
 *
 */
public class Problem20_ReorderList {

    public Node reorderList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Previous, current, next nodes
        Node previousNode = null;
        Node currentNode = slow.next;
        slow.next = null;
        Node nextNode;
        // Loop through the entire list
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        Node left = head;
        Node right = previousNode;

        while (right != null) {
            Node leftNext = left.next;
            Node rightNext = right.next;
            left.next = right;
            right.next = leftNext;
            left = leftNext;
            right = rightNext;
        }
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
