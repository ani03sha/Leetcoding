package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem14_SwappingNodesInALinkedList.ListNode;

class Problem14_SwappingNodesInALinkedListTest {

    private final Problem14_SwappingNodesInALinkedList testObject =
            new Problem14_SwappingNodesInALinkedList();

    @Test
    void testSwapNodes() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        ListNode expected = testObject.swapNodes(head, k);
        assertEquals(4, expected.next.val);
        assertEquals(2, expected.next.next.next.val);

        head = new ListNode(7);
        head.next = new ListNode(9);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(5);
        k = 5;
        expected = testObject.swapNodes(head, k);
        assertEquals(8, expected.next.next.next.next.val);
        assertEquals(7, expected.next.next.next.next.next.val);

        head = new ListNode(1);
        k = 1;
        expected = testObject.swapNodes(head, k);
        assertEquals(1, expected.val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        k = 1;
        expected = testObject.swapNodes(head, k);
        assertEquals(2, expected.val);
        assertEquals(1, expected.next.val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        k = 2;
        expected = testObject.swapNodes(head, k);
        assertEquals(2, expected.next.val);
    }
}