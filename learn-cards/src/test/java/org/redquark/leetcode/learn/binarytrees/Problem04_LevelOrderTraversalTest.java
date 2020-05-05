package org.redquark.leetcode.learn.binarytrees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.binarytrees.Problem04_LevelOrderTraversal.Node;

class Problem04_LevelOrderTraversalTest {

    private final Problem04_LevelOrderTraversal testObject = new Problem04_LevelOrderTraversal();

    @Test
    void testLevelOrder() {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        Integer[][] expectedArray = new Integer[][]{{3}, {9, 20}, {15, 7}};
        List<List<Integer>> expected = Arrays.stream(expectedArray)
                .map(Arrays::asList)
                .collect(Collectors.toList());

        assertEquals(expected, testObject.levelOrder(root));
    }
}