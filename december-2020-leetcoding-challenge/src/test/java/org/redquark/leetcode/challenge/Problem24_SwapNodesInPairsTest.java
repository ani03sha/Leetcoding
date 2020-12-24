package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem24_SwapNodesInPairs.Node;

class Problem24_SwapNodesInPairsTest {

    private final Problem24_SwapNodesInPairs testObject = new Problem24_SwapNodesInPairs();

    @Test
    void testSwapPairs() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node expected = testObject.swapPairs(head);
        assertEquals(2, expected.data);
        assertEquals(1, expected.next.data);
        assertEquals(4, expected.next.next.data);
        assertEquals(3, expected.next.next.next.data);

        expected = testObject.swapPairs(null);
        assertNull(expected);

        head = new Node(1);
        expected = testObject.swapPairs(head);
        assertEquals(1, expected.data);
    }
}