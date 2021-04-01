package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the head of a singly linked list, return true if it is a palindrome.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 10^5].
 * 0 <= Node.val <= 9
 * <p>
 * Follow up: Could you do it in O(n) time and O(1) space?
 */
public class Problem01_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        // Find the middle of the linked list
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Loop until fast pointer reaches the end
        while (fast != null && fast.next != null) {
            // Move slow pointer one step ahead
            slow = slow.next;
            // Move fast pointer two steps ahead
            fast = fast.next.next;
        }
        // At this point the list is divided into two
        // halves by the slow pointer.
        // We will reverse the right half
        slow = reverse(slow);
        // Again assign fast to the head of the list
        fast = head;
        // Now compare slow and fast one by one
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private ListNode reverse(ListNode node) {
        // Previous node of the node
        ListNode previous = null;
        // Next node of the node
        ListNode next;
        // Loop until we reach the end of the list
        while (node != null) {
            next = node.next;
            node.next = previous;
            previous = node;
            node = next;
        }
        return previous;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
