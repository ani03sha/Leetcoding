package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem15_InsertionSortList.ListNode;

class Problem15_InsertionSortListTest {

    private final Problem15_InsertionSortList testObject = new Problem15_InsertionSortList();

    @Test
    void testInsertionSortList() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode expected = testObject.insertionSortList(head);
        assertEquals(1, expected.val);
        assertEquals(2, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(4, expected.next.next.next.val);
    }
}