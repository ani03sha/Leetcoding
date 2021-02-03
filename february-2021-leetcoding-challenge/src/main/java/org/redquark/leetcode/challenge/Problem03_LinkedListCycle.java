package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again
 * by continuously following the next pointer.
 * <p>
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the list is in the range [0, 10^4].
 * -10^5 <= Node.val <= 10^5
 * pos is -1 or a valid index in the linked-list.
 * <p>
 * <p>
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */
public class Problem03_LinkedListCycle {

    /**
     * @param head - head of the linked list
     * @return true, if cycle is present, false otherwise
     */
    public boolean hasCycle(ListNode head) {
        // Special cases
        if (head == null || head.next == null) {
            return false;
        }
        // Slow and fast pointer
        ListNode slow = head;
        ListNode fast = head;
        // Loop until fast reaches end or
        // the two pointers meet
        while (fast != null && fast.next != null) {
            // Move slow pointer one step ahead
            slow = slow.next;
            // Move fast pointer two steps ahead
            fast = fast.next.next;
            // Check if slow and fast are pointing
            // to the same node
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
