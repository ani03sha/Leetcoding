package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem02_LinkedListRandomNode.Node;

class Problem02_LinkedListRandomNodeTest {

    @Test
    void testGetRandom() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Problem02_LinkedListRandomNode testObject = new Problem02_LinkedListRandomNode(head);
        int actual = testObject.getRandom();
        if (actual > 0 && actual < 4) {
            System.out.println("Test passed");
        }
    }
}