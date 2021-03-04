package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Write a program to find the node at which the intersection of two singly linked lists begins
 * <p>
 * Notes:
 * <p>
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Each value on each linked list is in the range [1, 10^9].
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class Problem04_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Special case
        if (headA == null || headB == null) {
            return null;
        }
        // Lengths of both lists
        int lengthA = 0;
        int lengthB = 0;
        // Reference of both heads
        ListNode tempA = headA;
        ListNode tempB = headB;
        // Calculate the length of both lists
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        // Calculate the difference between the two lengths
        int difference = Math.abs(lengthA - lengthB);
        // Traverse "difference" number of nodes in the
        // bigger list
        if (lengthA > lengthB) {
            tempA = headA;
            while (difference-- > 0) {
                tempA = tempA.next;
            }
            tempB = headB;
        } else {
            tempB = headB;
            while (difference-- > 0) {
                tempB = tempB.next;
            }
            tempA = headA;
        }
        // At this point, both lists have equal number of
        // nodes remaining to traverse
        // Loop through both the lists until nodes are matched
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
