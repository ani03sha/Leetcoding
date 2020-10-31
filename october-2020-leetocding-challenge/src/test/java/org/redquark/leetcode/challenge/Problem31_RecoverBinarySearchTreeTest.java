package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem31_RecoverBinarySearchTree.Node;

class Problem31_RecoverBinarySearchTreeTest {

    private final Problem31_RecoverBinarySearchTree testObject =
            new Problem31_RecoverBinarySearchTree();

    @Test
    void testRecoverTree() {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.right = new Node(2);
        Node expected = testObject.recoverTree(root);
        assertEquals(3, expected.data);
        assertEquals(1, expected.left.data);
        assertEquals(2, expected.left.right.data);
    }
}