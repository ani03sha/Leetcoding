package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem26_SumRootToLeafNumbers.Node;

class Problem26_SumRootToLeafNumbersTest {

    private final Problem26_SumRootToLeafNumbers testObject = new Problem26_SumRootToLeafNumbers();

    @Test
    void testSumNumbers() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        assertEquals(25, testObject.sumNumbers(root));

        root = new Node(4);
        root.left = new Node(9);
        root.right = new Node(0);
        root.left.left = new Node(5);
        root.left.right = new Node(1);

        assertEquals(1026, testObject.sumNumbers(root));
    }
}