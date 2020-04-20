package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.learn.linkedlists.Problem03_LinkedListCycleI.Node;


class Problem03_LinkedListCycleITest {

    private final Problem03_LinkedListCycleI testObject = new Problem03_LinkedListCycleI();

    @Test
    void testHasCycle() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;
        assertTrue(testObject.hasCycle(head));
        head.next.next.next = new Node(5);
        assertFalse(testObject.hasCycle(head));
        head.next.next = head;
        assertTrue(testObject.hasCycle(head));

    }
}