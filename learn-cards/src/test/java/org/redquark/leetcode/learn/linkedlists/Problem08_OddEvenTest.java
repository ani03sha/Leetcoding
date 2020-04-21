package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.linkedlists.Problem08_OddEven.Node;

class Problem08_OddEvenTest {

    private final Problem08_OddEven tesObject = new Problem08_OddEven();

    @Test
    void testOddEvenList() {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node oddEvenHead = tesObject.oddEvenList(head);

        assertEquals(3, oddEvenHead.next.data);
        assertEquals(2, oddEvenHead.next.next.next.data);
    }
}