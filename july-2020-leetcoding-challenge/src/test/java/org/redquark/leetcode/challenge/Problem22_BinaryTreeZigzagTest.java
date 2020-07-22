package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem22_BinaryTreeZigzag.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_BinaryTreeZigzagTest {

    private final Problem22_BinaryTreeZigzag testObject = new Problem22_BinaryTreeZigzag();

    @Test
    void testZigzagLevelOrder() {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(3));
        expected.add(Arrays.asList(20, 9));
        expected.add(Arrays.asList(15, 7));
        assertEquals(expected, testObject.zigzagLevelOrder(root));
    }
}