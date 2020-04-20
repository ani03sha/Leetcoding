package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.linkedlists.Problem04_LinkedListCycleII.Node;

class Problem04_LinkedListCycleIITest {

    private final Problem04_LinkedListCycleII testObject = new Problem04_LinkedListCycleII();

    @Test
    void testDetectCycle() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;
        Assertions.assertEquals(2, testObject.detectCycle(head).data);
        head.next.next.next = new Node(5);
        head.next.next = head;
        assertEquals(1, testObject.detectCycle(head).data);
    }
}