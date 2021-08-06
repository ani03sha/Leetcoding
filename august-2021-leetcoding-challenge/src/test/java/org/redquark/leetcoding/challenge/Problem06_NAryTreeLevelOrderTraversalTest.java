package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem06_NAryTreeLevelOrderTraversal.Node;

class Problem06_NAryTreeLevelOrderTraversalTest {

    private final Problem06_NAryTreeLevelOrderTraversal testObject = new Problem06_NAryTreeLevelOrderTraversal();

    @Test
    void testLevelOrder() {
        Node threeChildOne = new Node(5);
        Node threeChildTwo = new Node(6);
        Node rootChildOne = new Node(3);
        Node rootChildTwo = new Node(2, Arrays.asList(threeChildOne, threeChildTwo));
        Node rootChildThree = new Node(4);
        Node root = new Node(1, Arrays.asList(rootChildOne, rootChildTwo, rootChildThree));
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        expected.add(Arrays.asList(3, 2, 4));
        expected.add(Arrays.asList(5, 6));
        assertEquals(expected, testObject.levelOrder(root));
    }
}