package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem01_ConvertBinaryNumberInALinkedListToInteger.Node;

class Problem01_ConvertBinaryNumberInALinkedListToIntegerTest {

    private final Problem01_ConvertBinaryNumberInALinkedListToInteger testObject =
            new Problem01_ConvertBinaryNumberInALinkedListToInteger();

    @Test
    void testGetDecimalValue() {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);
        assertEquals(5, testObject.getDecimalValue(head));

        head = new Node(0);
        assertEquals(0, testObject.getDecimalValue(head));

        head = new Node(1);
        assertEquals(1, testObject.getDecimalValue(head));

        head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new Node(0);
        assertEquals(18880, testObject.getDecimalValue(head));

        head = new Node(0);
        head.next = new Node(0);
        assertEquals(0, testObject.getDecimalValue(head));
    }
}