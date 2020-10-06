package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem06_InsertIntoBST.Node;

class Problem06_InsertIntoBSTTest {

    private final Problem06_InsertIntoBST testObject = new Problem06_InsertIntoBST();

    @Test
    void testInsertIntoBST() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        int val = 5;

        assertEquals(5, testObject.insertIntoBST(root, val).right.left.data);
    }
}