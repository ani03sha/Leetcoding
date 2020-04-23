package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.linkedlists.Problem10_DesignDoublyLinkedList.DoublyLinkedList;

class Problem10_DesignDoublyLinkedListTest {

    private final DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    @BeforeEach
    public void setUp() {
        doublyLinkedList.addAtHead(1);
        doublyLinkedList.addAtIndex(1, 2);
        doublyLinkedList.addAtIndex(2, 3);
        doublyLinkedList.addAtIndex(3, 4);
        doublyLinkedList.addAtIndex(4, 5);
    }

    @Test
    void testGet() {
        assertEquals(2, doublyLinkedList.get(1));
        assertEquals(4, doublyLinkedList.get(3));
        assertEquals(5, doublyLinkedList.get(4));
    }

    @Test
    void testAddAtHead() {
        doublyLinkedList.addAtHead(5);
        assertEquals(5, doublyLinkedList.get(0));
        doublyLinkedList.addAtHead(6);
        doublyLinkedList.addAtHead(7);
        assertEquals(7, doublyLinkedList.get(0));
        assertEquals(6, doublyLinkedList.get(1));
    }

    @Test
    void testAddAtTail() {
        doublyLinkedList.addAtTail(5);
        assertEquals(5, doublyLinkedList.get(4));
        doublyLinkedList.addAtTail(6);
        assertEquals(5, doublyLinkedList.get(5));
    }

    @Test
    void testAddAtIndex() {
        doublyLinkedList.addAtIndex(0, 5);
        assertEquals(1, doublyLinkedList.get(1));
        doublyLinkedList.addAtIndex(3, 6);
        assertEquals(4, doublyLinkedList.get(5));
    }

    @Test
    void testDeleteAtIndex() {
        doublyLinkedList.deleteAtIndex(0);
        assertEquals(2, doublyLinkedList.get(0));
        doublyLinkedList.deleteAtIndex(3);
        assertEquals(-1, doublyLinkedList.get(3));
    }
}