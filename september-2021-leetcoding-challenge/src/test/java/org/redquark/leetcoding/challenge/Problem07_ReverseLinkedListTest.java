package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcoding.challenge.Problem07_ReverseLinkedList.ListNode;

class Problem07_ReverseLinkedListTest {

    private final Problem07_ReverseLinkedList testObject = new Problem07_ReverseLinkedList();

    @Test
    void testReverseList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = testObject.reverseList(head);
        assertEquals(5, expected.val);
        assertEquals(4, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(2, expected.next.next.next.val);
        assertEquals(1, expected.next.next.next.next.val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        expected = testObject.reverseList(head);
        assertEquals(2, expected.val);
        assertEquals(1, expected.next.val);

        assertNull(testObject.reverseList(null));
    }
}