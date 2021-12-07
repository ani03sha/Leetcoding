package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem07_ConvertBinaryNumberInALinkedListToInteger.ListNode;

class Problem07_ConvertBinaryNumberInALinkedListToIntegerTest {

    private final Problem07_ConvertBinaryNumberInALinkedListToInteger testObject = new Problem07_ConvertBinaryNumberInALinkedListToInteger();

    @Test
    void testGetDecimalValue() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        assertEquals(5, testObject.getDecimalValue(head));

        head = new ListNode(0);
        assertEquals(0, testObject.getDecimalValue(head));

        head = new ListNode(1);
        assertEquals(1, testObject.getDecimalValue(head));
    }
}