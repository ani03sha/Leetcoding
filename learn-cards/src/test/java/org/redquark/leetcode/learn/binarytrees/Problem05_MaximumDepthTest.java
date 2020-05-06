package org.redquark.leetcode.learn.binarytrees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.binarytrees.Problem05_MaximumDepth.Node;

class Problem05_MaximumDepthTest {

    private final Problem05_MaximumDepth testObject = new Problem05_MaximumDepth();

    @Test
    void testMaxDepth() {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        assertEquals(3, testObject.maxDepth(root));
    }
}