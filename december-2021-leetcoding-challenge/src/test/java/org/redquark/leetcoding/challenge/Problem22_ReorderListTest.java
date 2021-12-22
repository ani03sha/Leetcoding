package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem22_ReorderList.ListNode;

class Problem22_ReorderListTest {

    private final Problem22_ReorderList testObject = new Problem22_ReorderList();

    @Test
    void testReorderList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode expected = testObject.reorderList(head);
        assertEquals(1, expected.val);
        assertEquals(4, expected.next.val);
        assertEquals(2, expected.next.next.val);
        assertEquals(3, expected.next.next.next.val);
    }
}