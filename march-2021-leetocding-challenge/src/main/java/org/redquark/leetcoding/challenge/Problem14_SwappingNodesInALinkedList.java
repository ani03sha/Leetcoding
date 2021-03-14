package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given the head of a linked list, and an integer k.
 * <p>
 * Return the head of the linked list after swapping the values of the kth node from
 * the beginning and the kth node from the end (the list is 1-indexed).
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is n.
 * 1 <= k <= n <= 10^5
 * 0 <= Node.val <= 100
 */
public class Problem14_SwappingNodesInALinkedList {

    public ListNode swapNodes(ListNode head, int k) {
        // Base case
        if (head == null) {
            return null;
        }
        // Temp nodes
        ListNode tempA = head;
        ListNode tempB = head;
        // Kth node
        ListNode kthNode;
        // Traverse the node from the start
        for (int i = 1; i < k; i++) {
            tempA = tempA.next;
        }
        kthNode = tempA;
        tempA = tempA.next;
        // Loop until the tempA reaches end
        while (tempA != null) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        // Get the value in the kth node
        int value = kthNode.val;
        kthNode.val = tempB.val;
        tempB.val = value;
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
