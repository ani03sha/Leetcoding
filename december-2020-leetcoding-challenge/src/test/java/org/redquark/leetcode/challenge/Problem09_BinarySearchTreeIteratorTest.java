package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.challenge.Problem09_BinarySearchTreeIterator.BSTIterator;
import static org.redquark.leetcode.challenge.Problem09_BinarySearchTreeIterator.BSTIterator.Node;

class Problem09_BinarySearchTreeIteratorTest {

    @Test
    void test() {
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(15);
        root.right.left = new Node(9);
        root.right.right = new Node(20);
        BSTIterator bstIterator = new BSTIterator(root);

        assertEquals(3, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(7, bstIterator.next());
    }
}