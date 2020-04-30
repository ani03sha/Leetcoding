package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.challenge.Challenge30_ValidSequenceString.Node;

class Challenge30_ValidSequenceStringTest {

    private final Challenge30_ValidSequenceString testObject = new Challenge30_ValidSequenceString();

    @Test
    void isValidSequence() {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(0);
        root.right.left = new Node(0);
        root.left.left = new Node(0);
        root.left.right = new Node(1);
        root.left.left.right = new Node(1);
        root.left.right.left = new Node(0);
        root.left.right.right = new Node(0);

        int[] arr = new int[]{0, 1, 0, 1};

        assertTrue(testObject.isValidSequence(root, arr));
    }
}