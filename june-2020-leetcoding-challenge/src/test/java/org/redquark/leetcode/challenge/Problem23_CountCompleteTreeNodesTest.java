package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem23_CountCompleteTreeNodes.Node;

class Problem23_CountCompleteTreeNodesTest {

    private final Problem23_CountCompleteTreeNodes testObject = new Problem23_CountCompleteTreeNodes();

    @Test
    void countNodes() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        assertEquals(6, testObject.countNodes(root));
    }
}