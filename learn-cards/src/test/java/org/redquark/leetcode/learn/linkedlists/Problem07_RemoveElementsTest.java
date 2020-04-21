package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.linkedlists.Problem07_RemoveElements.Node;

class Problem07_RemoveElementsTest {

    private final Problem07_RemoveElements testObject = new Problem07_RemoveElements();

    @Test
    void testRemoveElements() {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        assertEquals(2, testObject.removeElements(head, 1).data);

        Node n7 = new Node(7);
        Node n8 = new Node(7);
        Node n9 = new Node(8);

        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        assertEquals(8, testObject.removeElements(head, 7).next.next.next.next.next.next.data);
    }
}