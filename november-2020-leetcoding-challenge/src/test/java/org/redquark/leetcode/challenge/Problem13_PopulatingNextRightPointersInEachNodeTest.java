package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem13_PopulatingNextRightPointersInEachNode.Node;

class Problem13_PopulatingNextRightPointersInEachNodeTest {

    private final Problem13_PopulatingNextRightPointersInEachNode testObject =
            new Problem13_PopulatingNextRightPointersInEachNode();

    @Test
    void testConnect() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node expected = testObject.connect(root);
        assertNull(expected.next);
        assertEquals(3, expected.left.next.data);
        assertEquals(5, expected.left.left.next.data);
        assertEquals(7, expected.right.left.next.data);
    }
}