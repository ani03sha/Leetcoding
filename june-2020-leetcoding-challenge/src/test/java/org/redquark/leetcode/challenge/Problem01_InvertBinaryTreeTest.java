package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem01_InvertBinaryTree.Node;

class Problem01_InvertBinaryTreeTest {

    private final Problem01_InvertBinaryTree testObject = new Problem01_InvertBinaryTree();

    @Test
    void testInvertTree() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        assertEquals(2, testObject.invertTree(root).right.data);
    }
}