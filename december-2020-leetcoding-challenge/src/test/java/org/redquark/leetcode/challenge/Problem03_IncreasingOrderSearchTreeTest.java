package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem03_IncreasingOrderSearchTree.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_IncreasingOrderSearchTreeTest {

    private final Problem03_IncreasingOrderSearchTree testObject = new Problem03_IncreasingOrderSearchTree();

    @Test
    void testIncreasingBST() {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.left.left.left = new Node(1);
        root.right.right = new Node(8);
        root.right.right.left = new Node(7);
        root.right.right.right = new Node(9);
        Node result = testObject.increasingBST(root);
        assertEquals(1, result.data);
        assertEquals(2, result.right.data);
        assertEquals(3, result.right.right.data);
        assertEquals(4, result.right.right.right.data);
        assertEquals(5, result.right.right.right.right.data);
        assertEquals(6, result.right.right.right.right.right.data);
        assertEquals(7, result.right.right.right.right.right.right.data);
        assertEquals(8, result.right.right.right.right.right.right.right.data);
        assertEquals(9, result.right.right.right.right.right.right.right.right.data);
    }
}