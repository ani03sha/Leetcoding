package org.redquark.leetcode.learn.binarytrees;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.learn.binarytrees.Problem03_PostorderTraversal.Node;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_PostorderTraversalTest {

    private final Problem03_PostorderTraversal testObject = new Problem03_PostorderTraversal();

    @Test
    void testPostorderTraversal() {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertEquals(expected, testObject.postorderTraversal(root));
    }
}