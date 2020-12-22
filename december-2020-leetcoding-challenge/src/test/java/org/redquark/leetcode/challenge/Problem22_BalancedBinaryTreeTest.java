package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.challenge.Problem22_BalancedBinaryTree.Node;

class Problem22_BalancedBinaryTreeTest {

    private final Problem22_BalancedBinaryTree testObject = new Problem22_BalancedBinaryTree();

    @Test
    void testIsBalanced() {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        assertTrue(testObject.isBalanced(root));

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(3);
        root.left.left.left = new Node(4);
        root.left.left.right = new Node(4);
        assertFalse(testObject.isBalanced(root));

        root = null;
        assertTrue(testObject.isBalanced(root));
    }
}