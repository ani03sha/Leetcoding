package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem07_RotateList.Node;

class Problem07_RotateListTest {

    private final Problem07_RotateList testObject = new Problem07_RotateList();

    @Test
    void testRotateRight() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;
        assertEquals(4, testObject.rotateRight(head, k).data);

        head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);

        k = 4;
        assertEquals(2, testObject.rotateRight(head, k).data);
    }
}