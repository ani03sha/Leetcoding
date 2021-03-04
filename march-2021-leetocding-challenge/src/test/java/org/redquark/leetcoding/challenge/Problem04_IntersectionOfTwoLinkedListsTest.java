package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcoding.challenge.Problem04_IntersectionOfTwoLinkedLists.ListNode;

class Problem04_IntersectionOfTwoLinkedListsTest {

    private final Problem04_IntersectionOfTwoLinkedLists testObject = new Problem04_IntersectionOfTwoLinkedLists();

    @Test
    void testGetIntersectionNode() {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = headA.next.next;

        assertEquals(8, testObject.getIntersectionNode(headA, headB).val);

        headA = new ListNode(1);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(1);
        headA.next.next.next = new ListNode(2);
        headA.next.next.next.next = new ListNode(4);

        headB = new ListNode(3);
        headB.next = headA.next.next.next;

        assertEquals(2, testObject.getIntersectionNode(headA, headB).val);

        headA = new ListNode(2);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(4);

        headB = new ListNode(1);
        headB.next = new ListNode(5);
        assertNull(testObject.getIntersectionNode(headA, headB));
    }
}