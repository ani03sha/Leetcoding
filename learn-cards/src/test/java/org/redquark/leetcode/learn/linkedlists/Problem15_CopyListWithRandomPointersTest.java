package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.learn.linkedlists.Problem15_CopyListWithRandomPointers.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_CopyListWithRandomPointersTest {

    private final Problem15_CopyListWithRandomPointers testObject = new Problem15_CopyListWithRandomPointers();

    @Test
    void testCopyRandomList() {

        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        head.random = n3;
        head.next.random = n4;
        n4.random = head;

        Node cloneHead = testObject.copyRandomList(head);

        assertEquals(1, cloneHead.data);
        assertEquals(4, cloneHead.random.data);
        assertEquals(5, cloneHead.next.random.data);
        assertEquals(1, cloneHead.next.next.next.next.random.data);
    }
}