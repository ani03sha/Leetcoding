package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem06_PopulatingNextRightPointersInEachNodeII.Node;

class Problem06_PopulatingNextRightPointersInEachNodeIITest {

    private final Problem06_PopulatingNextRightPointersInEachNodeII testObject =
            new Problem06_PopulatingNextRightPointersInEachNodeII();

    @Test
    void testConnect() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        Node expected = testObject.connect(root);
        assertNull(expected.next);
        assertEquals(3, expected.left.next.data);
    }
}