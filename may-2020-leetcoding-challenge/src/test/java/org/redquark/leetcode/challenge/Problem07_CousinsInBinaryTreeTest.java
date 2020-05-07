package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.challenge.Problem07_CousinsInBinaryTree.Node;

class Problem07_CousinsInBinaryTreeTest {

    private final Problem07_CousinsInBinaryTree testObject = new Problem07_CousinsInBinaryTree();

    @Test
    void testIsCousins() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        assertFalse(testObject.isCousins(root, 4, 3));

        root.left.right = new Node(4);
        root.right.right = new Node(5);

        assertTrue(testObject.isCousins(root, 5, 4));
    }
}