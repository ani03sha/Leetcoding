package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem02_LevelOrderTraversalII.Node;

class Problem02_LevelOrderTraversalIITest {

    private final Problem02_LevelOrderTraversalII testObject = new Problem02_LevelOrderTraversalII();

    @Test
    void testLevelOrderBottom() {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(15, 7));
        expected.add(Arrays.asList(9, 20));
        expected.add(Collections.singletonList(3));

        assertEquals(expected, testObject.levelOrderBottom(root));
    }
}