package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem18_RemoveNthNodeFromEndOfList.ListNode;

class Problem18_RemoveNthNodeFromEndOfListTest {

    private final Problem18_RemoveNthNodeFromEndOfList testObject = new Problem18_RemoveNthNodeFromEndOfList();

    @Test
    void testRemoveNthFromEnd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        ListNode expected = testObject.removeNthFromEnd(head, n);
        assertEquals(5, expected.next.next.next.val);

        head = new ListNode(1);
        n = 1;
        expected = testObject.removeNthFromEnd(head, n);
        assertNull(expected);

        head = new ListNode(1);
        head.next = new ListNode(2);
        n = 1;
        expected = testObject.removeNthFromEnd(head, n);
        assertEquals(1, expected.val);
    }
}