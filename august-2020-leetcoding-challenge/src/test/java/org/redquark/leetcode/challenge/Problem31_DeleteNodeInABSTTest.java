package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem31_DeleteNodeInABST.Node;

class Problem31_DeleteNodeInABSTTest {

    private final Problem31_DeleteNodeInABST testObject = new Problem31_DeleteNodeInABST();

    @Test
    void testDeleteNode() {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);

        int key = 3;

        assertEquals(4, testObject.deleteNode(root, key).left.data);
    }
}