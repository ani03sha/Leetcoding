package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem12_SmallestSubtreeWithAllTheDeepestNodes.Node;

class Problem12_SmallestSubtreeWithAllTheDeepestNodesTest {

    private final Problem12_SmallestSubtreeWithAllTheDeepestNodes testObject =
            new Problem12_SmallestSubtreeWithAllTheDeepestNodes();

    @Test
    void testSubtreeWithAllDeepest() {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        Node expected = testObject.subtreeWithAllDeepest(root);
        assertEquals(2, expected.data);
        assertEquals(7, expected.left.data);
        assertEquals(4, expected.right.data);
    }
}