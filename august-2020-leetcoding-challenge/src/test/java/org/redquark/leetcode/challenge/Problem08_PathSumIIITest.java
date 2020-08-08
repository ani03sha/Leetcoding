package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem08_PathSumIII.Node;

class Problem08_PathSumIIITest {

    private final Problem08_PathSumIII testObject = new Problem08_PathSumIII();

    @Test
    void testPathSum() {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(-3);
        root.right.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(-2);
        root.left.right.right = new Node(1);

        int sum = 8;

        assertEquals(3, testObject.pathSum(root, sum));
    }
}