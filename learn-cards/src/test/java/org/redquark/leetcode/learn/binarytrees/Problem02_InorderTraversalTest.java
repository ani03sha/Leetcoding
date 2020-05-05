package org.redquark.leetcode.learn.binarytrees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.binarytrees.Problem02_InorderTraversal.Node;

class Problem02_InorderTraversalTest {

    private final Problem02_InorderTraversal testObject = new Problem02_InorderTraversal();

    @Test
    void inorderTraversal() {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, testObject.inorderTraversal(root));
    }
}