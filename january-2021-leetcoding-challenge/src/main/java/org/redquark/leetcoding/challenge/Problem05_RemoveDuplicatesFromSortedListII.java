package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the
 * original list.
 * <p>
 * Return the linked list sorted as well.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 */
public class Problem05_RemoveDuplicatesFromSortedListII {

    /**
     * @param head - head of the given list
     * @return - head of list after removing duplicates
     */
    public ListNode deleteDuplicates(ListNode head) {
        // Base condition
        if (head == null || head.next == null) {
            return head;
        }
        // Dummy node
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        // Make head as next of dummy node
        dummy.next = head;
        // Previous and next pointer
        ListNode previousNode = dummy;
        ListNode nextNode = head;
        // Loop through the list
        while (nextNode != null) {
            while (nextNode.next != null && nextNode.val == nextNode.next.val) {
                nextNode = nextNode.next;
            }
            if (previousNode.next != nextNode) {
                previousNode.next = nextNode.next;
            } else {
                previousNode = previousNode.next;
            }
            nextNode = nextNode.next;
        }
        return dummy.next;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
