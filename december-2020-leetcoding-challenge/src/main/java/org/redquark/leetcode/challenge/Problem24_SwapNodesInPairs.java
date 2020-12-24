package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * You may not modify the values in the list's nodes. Only nodes itself may be changed.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 100].
 * 0 <= Node.val <= 100
 */
public class Problem24_SwapNodesInPairs {

    /**
     * @param head - head of the given linked list
     * @return head of the modified list
     */
    public Node swapPairs(Node head) {
        // Dummy node
        Node dummy = new Node(0);
        // Point the next of dummy node to the head
        dummy.next = head;
        // This node will be used to traverse the list
        Node current = dummy;
        // Loop until we reach to the second last node
        while (current.next != null && current.next.next != null) {
            // First node of the pair
            Node first = current.next;
            // Second node of the pair
            Node second = current.next.next;
            // Point the next of first node to the node after second node
            first.next = second.next;
            // Now the current node's next should be the second node
            current.next = second;
            // Linking the original second node to the first node
            current.next.next = first;
            // Move the pointer two nodes ahead
            current = current.next.next;
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
