package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.linkedlists.Problem06_RemoveNthNodeFromEnd.Node;

class Problem06_RemoveNthNodeFromEndTest {

    private final Problem06_RemoveNthNodeFromEnd testObject = new Problem06_RemoveNthNodeFromEnd();

    @Test
    void removeNthFromEnd() {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(7);
        Node n6 = new Node(8);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        assertEquals(7, testObject.removeNthFromEnd(head, 3).next.next.next.next.data);
        assertEquals(4, testObject.removeNthFromEnd(head, 4).next.next.data);
    }
}