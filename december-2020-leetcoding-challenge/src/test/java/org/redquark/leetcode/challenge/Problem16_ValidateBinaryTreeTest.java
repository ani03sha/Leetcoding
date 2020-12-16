package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.challenge.Problem16_ValidateBinaryTree.Node;

class Problem16_ValidateBinaryTreeTest {

    private final Problem16_ValidateBinaryTree testObject = new Problem16_ValidateBinaryTree();

    @Test
    void testIsValidBST() {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        assertTrue(testObject.isValidBST(root));

        root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(6);
        assertFalse(testObject.isValidBST(root));
    }
}