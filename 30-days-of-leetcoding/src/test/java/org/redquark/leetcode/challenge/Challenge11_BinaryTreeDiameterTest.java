package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Challenge11_BinaryTreeDiameter.Node;

class Challenge11_BinaryTreeDiameterTest {

    private Challenge11_BinaryTreeDiameter testObject = new Challenge11_BinaryTreeDiameter();

    @Test
    void diameter() {
        testObject.root = new Node(1);
        testObject.root.left = new Node(2);
        testObject.root.right = new Node(3);
        testObject.root.left.left = new Node(4);
        testObject.root.left.right = new Node(5);
        assertEquals(3, testObject.diameter(testObject.root));
    }
}