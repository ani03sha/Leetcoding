package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem09_MaximumWidthOfBinaryTree.Node;

class Problem09_MaximumWidthOfBinaryTreeTest {

    private final Problem09_MaximumWidthOfBinaryTree testObject = new Problem09_MaximumWidthOfBinaryTree();

    @Test
    void testWidthOfBinaryTree() {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);
        assertEquals(4, testObject.widthOfBinaryTree(root));
    }
}