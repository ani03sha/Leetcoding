package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.linkedlists.Problem14_RotateLinkedList.Node;

class Problem14_RotateLinkedListTest {

    private final Problem14_RotateLinkedList testObject = new Problem14_RotateLinkedList();

    @Test
    void testRotate() {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        assertEquals(4, testObject.rotate(head, 2).data);

    }
}