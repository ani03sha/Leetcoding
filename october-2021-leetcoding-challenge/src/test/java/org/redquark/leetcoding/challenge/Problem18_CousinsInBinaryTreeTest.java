package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcoding.challenge.Problem18_CousinsInBinaryTree.TreeNode;

class Problem18_CousinsInBinaryTreeTest {

    private final Problem18_CousinsInBinaryTree testObject = new Problem18_CousinsInBinaryTree();

    @Test
    void testIsCousins() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        int x = 4;
        int y = 3;
        assertFalse(testObject.isCousins(root, x, y));

        x = 3;
        y = 2;
        assertFalse(testObject.isCousins(root, x, y));

        root.right.right = new TreeNode(5);
        x = 4;
        y = 5;
        assertTrue(testObject.isCousins(root, x, y));
    }
}