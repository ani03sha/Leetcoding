package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem02_InsertionSortList.Node;

class Problem02_InsertionSortListTest {

    private final Problem02_InsertionSortList testObject = new Problem02_InsertionSortList();

    @Test
    void testInsertionSortList() {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        Node expected = testObject.insertionSortList(head);
        assertEquals(1, expected.data);
        assertEquals(2, expected.next.data);
        assertEquals(3, expected.next.next.data);
        assertEquals(4, expected.next.next.next.data);

        head = new Node(-1);
        head.next = new Node(5);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(0);
        expected = testObject.insertionSortList(head);
        assertEquals(-1, expected.data);
        assertEquals(0, expected.next.data);
        assertEquals(3, expected.next.next.data);
        assertEquals(4, expected.next.next.next.data);
        assertEquals(5, expected.next.next.next.next.data);
    }
}