package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem29_PseudoPalindromicPathsInABinaryTree.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_PseudoPalindromicPathsInABinaryTreeTest {

    private final Problem29_PseudoPalindromicPathsInABinaryTree testObject =
            new Problem29_PseudoPalindromicPathsInABinaryTree();

    @Test
    void testPseudoPalindromicPaths() {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(1);
        root.left.left = new Node(3);
        root.left.right = new Node(1);
        root.right.right = new Node(1);
        assertEquals(2, testObject.pseudoPalindromicPaths(root));

        root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.right = new Node(1);
        assertEquals(1, testObject.pseudoPalindromicPaths(root));

        root = new Node(9);
        assertEquals(1, testObject.pseudoPalindromicPaths(root));
    }
}