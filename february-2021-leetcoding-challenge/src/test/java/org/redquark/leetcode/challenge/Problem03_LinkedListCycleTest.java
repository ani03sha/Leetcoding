package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem03_LinkedListCycle.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem03_LinkedListCycleTest {

    private final Problem03_LinkedListCycle testObject = new Problem03_LinkedListCycle();

    @Test
    void testHasCycle() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        assertTrue(testObject.hasCycle(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        assertTrue(testObject.hasCycle(head));

        head = new ListNode(1);
        assertFalse(testObject.hasCycle(head));
    }
}