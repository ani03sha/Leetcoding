package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem22_MinimumDepthOfBinaryTree.Node;

class Problem22_MinimumDepthOfBinaryTreeTest {

    private final Problem22_MinimumDepthOfBinaryTree testObject =
            new Problem22_MinimumDepthOfBinaryTree();

    @Test
    void testMinDepth() {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        assertEquals(2, testObject.minDepth(root));

        root = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.right.right.right = new Node(5);
        root.right.right.right.right = new Node(6);
        assertEquals(5, testObject.minDepth(root));
    }
}