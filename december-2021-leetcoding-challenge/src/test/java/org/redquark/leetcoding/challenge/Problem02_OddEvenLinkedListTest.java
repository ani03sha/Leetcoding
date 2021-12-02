package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem02_OddEvenLinkedList.ListNode;

class Problem02_OddEvenLinkedListTest {

    private final Problem02_OddEvenLinkedList testObject = new Problem02_OddEvenLinkedList();

    @Test
    void testOddEvenList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = testObject.oddEvenList(head);
        assertEquals(1, expected.val);
        assertEquals(3, expected.next.val);
        assertEquals(5, expected.next.next.val);
        assertEquals(2, expected.next.next.next.val);
        assertEquals(4, expected.next.next.next.next.val);

        head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);
        expected = testObject.oddEvenList(head);
        assertEquals(2, expected.val);
        assertEquals(3, expected.next.val);
        assertEquals(6, expected.next.next.val);
        assertEquals(7, expected.next.next.next.val);
        assertEquals(1, expected.next.next.next.next.val);
        assertEquals(5, expected.next.next.next.next.next.val);
        assertEquals(4, expected.next.next.next.next.next.next.val);
    }
}