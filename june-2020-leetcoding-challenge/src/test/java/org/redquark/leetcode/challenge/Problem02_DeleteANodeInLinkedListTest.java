package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem02_DeleteANodeInLinkedList.Node;

class Problem02_DeleteANodeInLinkedListTest {

    private final Problem02_DeleteANodeInLinkedList testObject = new Problem02_DeleteANodeInLinkedList();

    @Test
    void testDeleteNode() {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);

        testObject.deleteNode(head.next);
        assertEquals(head.data, 4);
        assertEquals(head.next.data, 1);
        assertEquals(head.next.next.data, 9);
    }
}