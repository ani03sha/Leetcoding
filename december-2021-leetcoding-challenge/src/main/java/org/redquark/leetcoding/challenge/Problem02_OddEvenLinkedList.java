package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes
 * with even indices, and return the reordered list.
 * <p>
 * The first node is considered odd, and the second node is even, and so on.
 * <p>
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 * <p>
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 * <p>
 * Constraints:
 * <p>
 * n == number of nodes in the linked list
 * 0 <= n <= 10^4
 * -10^6 <= Node.val <= 10^6
 */
public class Problem02_OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        // Special case
        if (head == null || head.next == null) {
            return head;
        }
        // References of the odd and even lists
        ListNode odd = head;
        ListNode even = head.next;
        // Reference of the head of the even list
        ListNode evenHead = even;
        // Loop until the end of the list
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
