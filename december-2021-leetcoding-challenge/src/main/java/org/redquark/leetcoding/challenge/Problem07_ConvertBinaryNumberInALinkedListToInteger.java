package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either
 * 0 or 1. The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * <p>
 * Constraints:
 * <p>
 * The Linked List is not empty.
 * Number of nodes will not exceed 30.
 * Each node's value is either 0 or 1.
 */
public class Problem07_ConvertBinaryNumberInALinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = (result << 1) | head.val;
            head = head.next;
        }
        return result;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
