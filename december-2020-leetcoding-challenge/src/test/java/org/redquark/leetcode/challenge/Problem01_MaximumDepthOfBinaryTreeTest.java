package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem01_MaximumDepthOfBinaryTree.Node;

class Problem01_MaximumDepthOfBinaryTreeTest {

    private final Problem01_MaximumDepthOfBinaryTree testObject = new Problem01_MaximumDepthOfBinaryTree();

    @Test
    void testMaxDepth() {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        assertEquals(3, testObject.maxDepth(root));

        root = new Node(1);
        root.right = new Node(2);
        assertEquals(2, testObject.maxDepth(root));

        root = null;
        assertEquals(0, testObject.maxDepth(root));

        root = new Node(0);
        assertEquals(1, testObject.maxDepth(root));
    }
}