package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.linkedlists.Problem11_MergeTwoLists.Node;

class Problem11_MergeTwoListsTest {

    private static final Problem11_MergeTwoLists testObject = new Problem11_MergeTwoLists();

    @Test
    void testMergeTwoLists() {

        Node head1 = new Node(1);
        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(7);
        Node n4 = new Node(9);

        head1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node head2 = new Node(2);
        n1 = new Node(4);
        n2 = new Node(6);
        n3 = new Node(8);
        n4 = new Node(10);

        head2.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node head = testObject.mergeTwoLists(head1, head2);

        assertEquals(1, head.data);
        assertEquals(2, head.next.data);
        assertEquals(3, head.next.next.data);
        assertEquals(4, head.next.next.next.data);
        assertEquals(5, head.next.next.next.next.data);
        assertEquals(6, head.next.next.next.next.next.data);
        assertEquals(7, head.next.next.next.next.next.next.data);
        assertEquals(8, head.next.next.next.next.next.next.next.data);
        assertEquals(9, head.next.next.next.next.next.next.next.next.data);
        assertEquals(10, head.next.next.next.next.next.next.next.next.next.data);
    }
}