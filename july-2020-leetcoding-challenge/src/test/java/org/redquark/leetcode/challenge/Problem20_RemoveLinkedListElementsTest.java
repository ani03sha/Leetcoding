package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem20_RemoveLinkedListElements.Node;

class Problem20_RemoveLinkedListElementsTest {

    private final Problem20_RemoveLinkedListElements testObject = new Problem20_RemoveLinkedListElements();

    @Test
    void testRemoveElements() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(6);
        int val = 6;
        assertEquals(4, testObject.removeElements(head, 6).next.next.next.data);
    }
}