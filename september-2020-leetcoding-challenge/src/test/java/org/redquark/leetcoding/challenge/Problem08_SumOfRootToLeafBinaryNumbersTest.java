package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcoding.challenge.Problem08_SumOfRootToLeafBinaryNumbers.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_SumOfRootToLeafBinaryNumbersTest {

    private final Problem08_SumOfRootToLeafBinaryNumbers testObject =
            new Problem08_SumOfRootToLeafBinaryNumbers();

    @Test
    void testSumRootToLeaf() {
        Node root = new Node(1);
        root.left = new Node(0);
        root.right = new Node(1);
        root.left.left = new Node(0);
        root.left.right = new Node(1);
        root.right.left = new Node(0);
        root.right.right = new Node(1);
        assertEquals(22, testObject.sumRootToLeaf(root));
    }
}