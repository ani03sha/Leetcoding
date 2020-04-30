package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.redquark.leetcode.challenge.Challenge29_BinaryTreeMaximumPathSum.Node;

class Challenge29_BinaryTreeMaximumPathSumTest {

    private final Challenge29_BinaryTreeMaximumPathSum tree = new Challenge29_BinaryTreeMaximumPathSum();

    @BeforeEach
    public void setUp() {
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);
    }

    @Test
    void maxPathSum() {
        Assertions.assertEquals(42, tree.maxPathSum(tree.root));
    }
}