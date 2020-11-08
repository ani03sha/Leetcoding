package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem08_BinaryTreeTilt.Node;

class Problem08_BinaryTreeTiltTest {

    private final Problem08_BinaryTreeTilt testObject = new Problem08_BinaryTreeTilt();

    @Test
    void testFindTilt() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        assertEquals(1, testObject.findTilt(root));

        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(9);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        assertEquals(15, testObject.findTilt(root));

        root = new Node(21);
        root.left = new Node(7);
        root.right = new Node(14);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(3);
        root.right.left = new Node(2);
        root.right.right = new Node(2);
        assertEquals(9, testObject.findTilt(root));
    }
}