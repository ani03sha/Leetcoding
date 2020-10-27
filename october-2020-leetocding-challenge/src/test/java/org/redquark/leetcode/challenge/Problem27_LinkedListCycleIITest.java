package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem27_LinkedListCycleII.Node;

class Problem27_LinkedListCycleIITest {

    private final Problem27_LinkedListCycleII testObject = new Problem27_LinkedListCycleII();

    @Test
    void testDetectCycle() {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        assertEquals(2, testObject.detectCycle(head).data);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = head;
        assertEquals(1, testObject.detectCycle(head).data);

        head = new Node(1);
        assertNull(testObject.detectCycle(head));
    }
}