package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcoding.challenge.Problem29_PopulatingNextRightPointersInEachNode.Node;

class Problem29_PopulatingNextRightPointersInEachNodeTest {

    private final Problem29_PopulatingNextRightPointersInEachNode testObject =
            new Problem29_PopulatingNextRightPointersInEachNode();

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
        assertEquals(3, expected.left.next.val);
        assertNull(expected.right.next);
        assertEquals(5, expected.left.left.next.val);
        assertEquals(6, expected.left.right.next.val);
        assertEquals(7, expected.right.left.next.val);
        assertNull(expected.right.right.next);
    }
}