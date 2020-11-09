package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem09_MaximumDifferenceBetweenNodeAndAncestor.Node;

class Problem09_MaximumDifferenceBetweenNodeAndAncestorTest {

    private final Problem09_MaximumDifferenceBetweenNodeAndAncestor testObject =
            new Problem09_MaximumDifferenceBetweenNodeAndAncestor();

    @Test
    void testMaxAncestorDiff() {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        root.right.right.right = new Node(13);
        assertEquals(7, testObject.maxAncestorDiff(root));
    }
}