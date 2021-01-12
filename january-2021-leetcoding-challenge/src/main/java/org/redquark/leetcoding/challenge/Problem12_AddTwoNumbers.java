package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class Problem12_AddTwoNumbers {

    /**
     * @param l1 - head of list one
     * @param l2 - head of list two
     * @return - head of list with sum
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Head of the new linked list
        ListNode head = null;
        // Reference of head
        ListNode temp = head;
        // Carry
        int carry = 0;
        // Loop
        while (l1 != null || l2 != null) {
            // Addition of respective nodes
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);
            carry = sum / 10;
            if (temp == null) {
                temp = head = node;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
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
