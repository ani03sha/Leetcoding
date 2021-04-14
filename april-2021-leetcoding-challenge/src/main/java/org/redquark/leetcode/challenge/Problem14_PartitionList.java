package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the head of a linked list and a value x, partition it such that all nodes less than x
 * come before nodes greater than or equal to x.
 * <p>
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 200].
 * -100 <= Node.val <= 100
 * -200 <= x <= 200
 */
public class Problem14_PartitionList {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode leftHead = null;
        ListNode rightHead = null;
        ListNode leftTraversalNode = null;
        ListNode rightTraversalNode = null;
        ListNode traversalNode = head;
        while (traversalNode != null) {
            if (traversalNode.val < x) {
                if (leftHead == null) {
                    leftTraversalNode = traversalNode;
                    leftHead = leftTraversalNode;
                } else {
                    leftTraversalNode.next = traversalNode;
                    leftTraversalNode = leftTraversalNode.next;
                }
            } else {
                if (rightHead == null) {
                    rightTraversalNode = traversalNode;
                    rightHead = rightTraversalNode;
                } else {
                    rightTraversalNode.next = traversalNode;
                    rightTraversalNode = rightTraversalNode.next;
                }
            }
            traversalNode = traversalNode.next;
        }
        if (leftTraversalNode != null) {
            leftTraversalNode.next = null;
        }
        if (rightTraversalNode != null) {
            rightTraversalNode.next = null;
        }
        if (leftHead == null) {
            return rightHead;
        }
        leftTraversalNode.next = rightHead;
        return leftHead;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
