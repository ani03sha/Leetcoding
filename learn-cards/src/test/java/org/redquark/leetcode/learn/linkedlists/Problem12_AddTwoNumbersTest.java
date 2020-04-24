package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.linkedlists.Problem12_AddTwoNumbers.Node;

class Problem12_AddTwoNumbersTest {

    private final Problem12_AddTwoNumbers testObject = new Problem12_AddTwoNumbers();

    @Test
    void addTwoNumbers() {

        Node head1 = new Node(1);
        Node n1 = new Node(3);
        Node n2 = new Node(5);

        head1.next = n1;
        n1.next = n2;

        Node head2 = new Node(2);
        n1 = new Node(4);
        n2 = new Node(6);

        head2.next = n1;
        n1.next = n2;

        Node head = testObject.addTwoNumbers(head1, head2);

        assertEquals(3, head.data);
    }
}