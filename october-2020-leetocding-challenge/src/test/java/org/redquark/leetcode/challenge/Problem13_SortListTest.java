package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem13_SortList.Node;

class Problem13_SortListTest {

    private final Problem13_SortList testObject = new Problem13_SortList();

    @Test
    void testSortList() {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        Node sortedList = testObject.sortList(head);
        assertEquals(1, sortedList.data);
        assertEquals(2, sortedList.next.data);

        head = new Node(-1);
        head.next = new Node(5);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(0);
        sortedList = testObject.sortList(head);
        assertEquals(0, sortedList.next.data);
        assertEquals(3, sortedList.next.next.data);

        head = null;
        assertNull(testObject.sortList(head));
    }
}