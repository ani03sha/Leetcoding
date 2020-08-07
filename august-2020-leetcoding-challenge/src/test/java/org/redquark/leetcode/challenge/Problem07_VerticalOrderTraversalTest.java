package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem07_VerticalOrderTraversal.Node;

class Problem07_VerticalOrderTraversalTest {

    private final Problem07_VerticalOrderTraversal testObject = new Problem07_VerticalOrderTraversal();

    @Test
    void testVerticalTraversal() {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(9));
        expected.add(Arrays.asList(3, 15));
        expected.add(Collections.singletonList(20));
        expected.add(Collections.singletonList(7));

        assertEquals(expected, testObject.verticalTraversal(root));

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        expected.clear();

        expected.add(Collections.singletonList(4));
        expected.add(Collections.singletonList(2));
        expected.add(Arrays.asList(1, 5, 6));
        expected.add(Collections.singletonList(3));
        expected.add(Collections.singletonList(7));

        assertEquals(expected, testObject.verticalTraversal(root));
    }
}