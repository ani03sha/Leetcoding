package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem28_MiddleOfTheLinkedList.ListNode;

class Problem28_MiddleOfTheLinkedListTest {

    private final Problem28_MiddleOfTheLinkedList testObject = new Problem28_MiddleOfTheLinkedList();

    @Test
    void testMiddleNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = testObject.middleNode(head);
        assertEquals(3, expected.val);
    }
}