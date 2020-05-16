package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem16_OddEvenLinkedList.Node;

class Problem16_OddEvenLinkedListTest {

    private final Problem16_OddEvenLinkedList testObject = new Problem16_OddEvenLinkedList();

    @Test
    void testOddEvenList() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        assertEquals(3, testObject.oddEvenList(head).next.data);
    }
}