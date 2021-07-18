package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem18_ReverseNodesInKGroup.ListNode;

class Problem18_ReverseNodesInKGroupTest {

    private final Problem18_ReverseNodesInKGroup testObject = new Problem18_ReverseNodesInKGroup();

    @Test
    void testReverseKGroup() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 3;
        ListNode expected = testObject.reverseKGroup(head, k);
        assertEquals(3, expected.val);
        assertEquals(2, expected.next.val);
        assertEquals(1, expected.next.next.val);
        assertEquals(4, expected.next.next.next.val);
        assertEquals(5, expected.next.next.next.next.val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        k = 1;
        expected = testObject.reverseKGroup(head, k);
        assertEquals(1, expected.val);
        assertEquals(2, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(4, expected.next.next.next.val);
        assertEquals(5, expected.next.next.next.next.val);

        head = new ListNode(1);
        k = 1;
        expected = testObject.reverseKGroup(head, k);
        assertEquals(1, expected.val);
    }
}