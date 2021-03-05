package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem05_AverageOfLevelsInBinaryTree.TreeNode;

class Problem05_AverageOfLevelsInBinaryTreeTest {

    private final Problem05_AverageOfLevelsInBinaryTree testObject = new Problem05_AverageOfLevelsInBinaryTree();

    @Test
    void testAverageOfLevels() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Double> expected = Arrays.asList(3.0, 14.5, 11.0);
        assertEquals(expected, testObject.averageOfLevels(root));

        root = new TreeNode(Integer.MAX_VALUE);
        root.left = new TreeNode(Integer.MAX_VALUE);
        root.right = new TreeNode(Integer.MAX_VALUE);
    }
}