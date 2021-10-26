package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem26_InvertBinaryTree.TreeNode;

class Problem26_InvertBinaryTreeTest {

    private final Problem26_InvertBinaryTree testObject = new Problem26_InvertBinaryTree();

    @Test
    void testInvertTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreeNode expected = testObject.invertTree(root);
        assertEquals(4, expected.val);
        assertEquals(7, expected.left.val);
        assertEquals(2, expected.right.val);
        assertEquals(9, expected.left.left.val);
        assertEquals(6, expected.left.right.val);
        assertEquals(3, expected.right.left.val);
        assertEquals(1, expected.right.right.val);
    }
}