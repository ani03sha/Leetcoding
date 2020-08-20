package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem20_ReorderList.Node;

class Problem20_ReorderListTest {

    private final Problem20_ReorderList testObject = new Problem20_ReorderList();

    @Test
    void testReorderList() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        assertEquals(5, testObject.reorderList(head).next.data);
    }
}