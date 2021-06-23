package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem23_ReverseLinkedListII.ListNode;

class Problem23_ReverseLinkedListIITest {

    private final Problem23_ReverseLinkedListII testObject = new Problem23_ReverseLinkedListII();

    @Test
    void testReverseBetween() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = testObject.reverseBetween(head, 2, 4);
        assertEquals(1, expected.val);
        assertEquals(4, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(2, expected.next.next.next.val);
        assertEquals(5, expected.next.next.next.next.val);

        head = new ListNode(5);
        expected = testObject.reverseBetween(head, 1, 1);
        assertEquals(5, expected.val);
        assertNull(expected.next);
    }
}