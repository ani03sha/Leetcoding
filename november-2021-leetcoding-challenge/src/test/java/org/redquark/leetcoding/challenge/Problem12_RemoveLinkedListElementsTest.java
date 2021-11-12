package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem12_RemoveLinkedListElements.ListNode;

class Problem12_RemoveLinkedListElementsTest {

    private final Problem12_RemoveLinkedListElements testObject = new Problem12_RemoveLinkedListElements();

    @Test
    void testRemoveElements() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        int val = 6;
        ListNode expected = testObject.removeElements(head, val);
        assertEquals(1, expected.val);
        assertEquals(2, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(4, expected.next.next.next.val);
        assertEquals(5, expected.next.next.next.next.val);
    }
}