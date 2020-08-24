package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem24_SumOfLeftLeaves.Node;

class Problem24_SumOfLeftLeavesTest {

    private final Problem24_SumOfLeftLeaves testObject = new Problem24_SumOfLeftLeaves();

    @Test
    void testSumOfLeftLeaves() {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        assertEquals(24, testObject.sumOfLeftLeaves(root));
    }
}