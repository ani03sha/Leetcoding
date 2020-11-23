package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem23_HouseRobberIII.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_HouseRobberIIITest {

    private final Problem23_HouseRobberIII testObject = new Problem23_HouseRobberIII();

    @Test
    void testRob() {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(3);
        root.right.right = new Node(1);
        assertEquals(7, testObject.rob(root));

        root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(1);
        assertEquals(9, testObject.rob(root));
    }
}