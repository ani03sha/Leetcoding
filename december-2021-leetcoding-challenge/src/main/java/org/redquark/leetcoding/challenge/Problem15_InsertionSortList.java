package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
 * <p>
 * The steps of the insertion sort algorithm:
 * <p>
 * Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the
 * sorted list and inserts it there. It repeats until no input elements remain.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 5000].
 * -5000 <= Node.val <= 5000
 */
public class Problem15_InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        // Current node
        ListNode current = head;
        ListNode next;
        ListNode dummy = new ListNode(-1);
        // Loop through the entire list
        while (current != null) {
            next = current.next;
            // Temp node
            ListNode temp = dummy;
            while (temp.next != null && temp.next.val < current.val) {
                temp = temp.next;
            }
            current.next = temp.next;
            temp.next = current;
            current = next;
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
