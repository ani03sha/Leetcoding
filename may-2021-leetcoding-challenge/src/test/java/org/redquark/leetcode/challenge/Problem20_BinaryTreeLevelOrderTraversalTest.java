package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem20_BinaryTreeLevelOrderTraversal.TreeNode;

class Problem20_BinaryTreeLevelOrderTraversalTest {

    private final Problem20_BinaryTreeLevelOrderTraversal testObject = new Problem20_BinaryTreeLevelOrderTraversal();

    @Test
    void testLevelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7));
        assertEquals(expected, testObject.levelOrder(root));

        root = new TreeNode(1);
        expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        assertEquals(expected, testObject.levelOrder(root));

        expected = new ArrayList<>();
        assertEquals(expected, testObject.levelOrder(null));
    }
}