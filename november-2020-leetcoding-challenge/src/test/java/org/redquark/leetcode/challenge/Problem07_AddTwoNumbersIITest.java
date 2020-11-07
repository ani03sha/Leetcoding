package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem07_AddTwoNumbersII.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_AddTwoNumbersIITest {

    private final Problem07_AddTwoNumbersII testObject = new Problem07_AddTwoNumbersII();

    @Test
    void testAddTwoNumbers() {
        Node head1 = new Node(7);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        Node expected = testObject.addTwoNumbers(head1, head2);
        assertEquals(7, expected.data);
        assertEquals(8, expected.next.data);
        assertEquals(0, expected.next.next.data);
        assertEquals(7, expected.next.next.next.data);
    }
}