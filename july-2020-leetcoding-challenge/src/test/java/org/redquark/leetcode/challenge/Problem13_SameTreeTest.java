package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem13_SameTree.Node;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem13_SameTreeTest {

    private final Problem13_SameTree testObject = new Problem13_SameTree();

    @Test
    void testIsSameTree() {
        Node headP = new Node(1);
        headP.left = new Node(2);
        headP.right = new Node(3);

        Node headQ = new Node(1);
        headQ.left = new Node(2);
        headQ.right = new Node(3);

        assertTrue(testObject.isSameTree(headP, headQ));

        headP = new Node(4);
        headP.left = new Node(5);
        headP.right = new Node(6);

        headQ = new Node(4);
        headQ.left = new Node(5);
        headQ.right = new Node(6);
        headQ.left = new Node(7);

        assertFalse(testObject.isSameTree(headP, headQ));
    }
}