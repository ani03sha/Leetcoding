package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem20_KthSmallestElementInBST.Node;

class Problem20_KthSmallestElementInBSTTest {

    private final Problem20_KthSmallestElementInBST testObject = new Problem20_KthSmallestElementInBST();

    @Test
    void kthSmallest() {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);

        assertEquals(1, testObject.kthSmallest(root, 1));
    }
}