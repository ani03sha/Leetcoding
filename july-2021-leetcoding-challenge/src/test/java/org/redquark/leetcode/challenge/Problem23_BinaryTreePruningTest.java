package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem23_BinaryTreePruning.TreeNode;

class Problem23_BinaryTreePruningTest {

    private final Problem23_BinaryTreePruning testObject = new Problem23_BinaryTreePruning();

    @Test
    void testPruneTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode expected = testObject.pruneTree(root);
        assertEquals(1, expected.val);
        assertEquals(0, expected.right.val);
        assertEquals(1, expected.right.right.val);
        assertNull(expected.right.left);

        root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        expected = testObject.pruneTree(root);
        assertEquals(1, expected.val);
        assertEquals(1, expected.right.val);
        assertEquals(1, expected.right.right.val);
        assertNull(expected.left);

        root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        root.left.left.left = new TreeNode(0);
        expected = testObject.pruneTree(root);
        assertEquals(1, expected.val);
        assertEquals(1, expected.left.val);
        assertEquals(0, expected.right.val);
        assertEquals(1, expected.left.left.val);
        assertEquals(1, expected.left.right.val);
        assertEquals(1, expected.right.right.val);
        assertNull(expected.right.left);
    }
}