package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem15_RangeSumOfBST.Node;

class Problem15_RangeSumOfBSTTest {

    private final Problem15_RangeSumOfBST testObject = new Problem15_RangeSumOfBST();

    @Test
    void testRangeSumBST() {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.right = new Node(18);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        int low = 7;
        int high = 15;
        assertEquals(32, testObject.rangeSumBST(root, low, high));

        root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(13);
        root.right.right = new Node(18);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.left.left.left = new Node(1);
        root.left.right.left = new Node(6);
        low = 6;
        high = 10;
        assertEquals(23, testObject.rangeSumBST(root, low, high));
    }
}