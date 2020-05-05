package org.redquark.leetcode.learn.binarytrees;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.learn.binarytrees.Problem01_PreorderTraversal.Node;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_PreorderTraversalTest {

    private final Problem01_PreorderTraversal testObject = new Problem01_PreorderTraversal();

    @Test
    void testPreorderTraversal() {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, testObject.preorderTraversal(root));
    }
}